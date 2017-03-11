package IO;

import Exceptions.InvalidFileNameException;
import Exceptions.InvalidPathException;
import StaticData.SessionData;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class IOManager {

    public void traverseDirectory(int depth){
        LinkedList<File> subFolders = new LinkedList<File>();

        String path = SessionData.currentPath;
        int initialIndentation = path.split("\\\\").length;

        File root = new File(path);
        subFolders.add(root);


        while (subFolders.size() != 0) {
            File currentFolder = subFolders.removeFirst();
            int currentIndentation = currentFolder.toString().split("\\\\").length - initialIndentation;

            if (depth - currentIndentation < 0) {
                break;
            }

            OutputWriter.writeMessageOnNewLine(currentFolder.toString());
            try {
                if (currentFolder.listFiles() != null) {
                    for (File file : currentFolder.listFiles()) {
                        if (file.isDirectory()) {

                            subFolders.add(file);
                        } else {
                            int indexOfLastSlash = file.toString().lastIndexOf("\\");
                            for (int i = 0; i < indexOfLastSlash; i++) {
                                OutputWriter.writeMessage("-");
                            }
                            OutputWriter.writeMessageOnNewLine(file.getName());
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Access denied");
            }
        }
    }

    public void createDirectoryInCurrentFolder(String name) {
        String path = getCurrentDirectoryPath() + "\\" + name;
        File file = new File(path);
        boolean wasDirMade = file.mkdir();
        if(!wasDirMade) {
            throw new InvalidFileNameException();
        }
    }

    public String getCurrentDirectoryPath(){
        String currentPath = SessionData.currentPath;
        return currentPath;
    }

    public void changeCurrentDirRelativePath(String relativePath) throws IOException {
        if (relativePath.equals("..")) {
            try {
                String currentPath = getCurrentDirectoryPath();
                int indexOfLastSlash = currentPath.lastIndexOf("\\");
                String newPath = currentPath.substring(0, indexOfLastSlash);
                SessionData.currentPath = newPath;
            } catch (StringIndexOutOfBoundsException sioobe) {
                throw new InvalidPathException();
            }
        } else {
            String currentPath = getCurrentDirectoryPath();
            currentPath += "\\" + relativePath;
            changeCurrentDirAbsolutePath(currentPath);
        }
    }

    public void changeCurrentDirAbsolutePath(String absolutePath) throws IOException {
        File file = new File(absolutePath);
        if (!file.exists()) {
            throw new InvalidPathException();
        }

        SessionData.currentPath = absolutePath;
    }
}
