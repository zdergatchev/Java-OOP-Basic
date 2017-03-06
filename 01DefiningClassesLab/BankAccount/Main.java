package BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();

        while (!"End".equals(command)){
            String[] commandArgs = command.split("\\s+");
            String commandType = commandArgs[0];

            switch (commandType){
                case "Create":
                    executeCreateCommand(accounts, commandArgs);
                    break;
                case "Deposit":
                    executeDepositCommand(accounts, commandArgs);
                    break;
                case "Withdraw":
                    executeWithDrawCommand(accounts, commandArgs);
                    break;
                case "Print":
                    executePrintCommand(accounts, commandArgs);
                    break;
            }
            command = reader.readLine();
        }

    }

    private static void executePrintCommand(HashMap<Integer, BankAccount> accounts, String[] commandArgs) {
        Integer id = Integer.parseInt(commandArgs[1]);
        if (accounts.containsKey(id)){
            System.out.println(accounts.get(id));
        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void executeWithDrawCommand(HashMap<Integer, BankAccount> accounts, String[] commandArgs) {
        Integer id = Integer.parseInt(commandArgs[1]);
        Double money = Double.parseDouble(commandArgs[2]);

        if (accounts.containsKey(id)){
            BankAccount account = accounts.get(id);
            account.withdraw(money);
        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void executeDepositCommand(HashMap<Integer, BankAccount> accounts, String[] commandArgs) {
        Integer id = Integer.parseInt(commandArgs[1]);
        Double money = Double.parseDouble(commandArgs[2]);

        if (accounts.containsKey(id)){
            BankAccount account = accounts.get(id);
            account.deposit(money);
        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void executeCreateCommand(HashMap<Integer, BankAccount> accounts, String[] commandArgs) {
        int id = Integer.parseInt(commandArgs[1]);
        if (accounts.containsKey(id)){
            System.out.println("Account already exists");
        }else{
            BankAccount account = new BankAccount();
            account.setId(id);
            accounts.put(id, account);
        }
    }
}
