package IO;


public class OutputWriter {
    public static void writeMessage(String message){
        System.out.print(message);
    }

    public static void writeMessageOnNewLine(String message){
        System.out.println(message);
    }

    public static void writeEmptyLine(){
        System.lineSeparator();
    }

    public static void displayException(String message){
        System.out.println(message);
    }

    public static void printStudent(String name, Double mark){
        String output = String.format("%s - %f", name, mark);
        OutputWriter.writeMessageOnNewLine(output);
    }
}
