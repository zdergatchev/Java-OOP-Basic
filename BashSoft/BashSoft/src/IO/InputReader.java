package IO;

import StaticData.SessionData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

    private final String END_COMMAND = "quit";
    private CommandInterpreter interpreter;

    public InputReader (CommandInterpreter interpreter) {
        this.interpreter = interpreter;
    }

    public void readCommands() throws Exception {
        OutputWriter.writeMessage(String.format("%s > ", SessionData.currentPath));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();

        while (!END_COMMAND.equals(input)) {

            this.interpreter.interpretCommand(input);
            OutputWriter.writeMessage(String.format("%s > ", SessionData.currentPath));

            input = reader.readLine().trim();

        }

        for (Thread thread : SessionData.threadPool) {
            thread.join();
        }
    }
}
