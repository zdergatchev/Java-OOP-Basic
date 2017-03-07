package CatLady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, CatLady> catByName = new HashMap<>();

        String command = in.nextLine();
        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");

            String type = tokens[0];
            String name = tokens[1];
            String characteristic = tokens[2];

            CatLady cat = new CatLady(name, characteristic, type);
            catByName.put(name, cat);

            command = in.nextLine();
        }
        String searchedCat = in.nextLine();
        System.out.println(catByName.get(searchedCat));
    }
}
