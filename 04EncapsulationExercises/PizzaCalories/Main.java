package PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String input = sc.readLine();
        String[] data = input.split("\\s+");
        if (data[0].toLowerCase().equals("pizza")) {
            Pizza myPizza = null;
            try {
                myPizza = new Pizza(data[1], Integer.parseInt(data[2]));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                return;
            }

            input = sc.readLine();
            data = input.split("\\s+");
            try {
                myPizza.createDough(new Dough(data[1], data[2], Double.parseDouble(data[3])));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                return;
            }


            input = sc.readLine();
            while (!input.equals("END")) {
                data = input.split("\\s+");

                try {
                    myPizza.addTopping(new Topping(data[1], Double.parseDouble(data[2])));
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    return;
                }


                input = sc.readLine();

            }
            System.out.printf("%s - %.2f Calories.", myPizza.getName(), myPizza.totalCalories());
        } else {
            try {
                Dough dough = new Dough(data[1], data[2], Double.parseDouble(data[3]));
                System.out.printf("%.2f%n", dough.calculateCalories());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                return;
            }

            input = sc.readLine();
            while (!input.equals("END")) {
                data = input.split("\\s+");

                try {
                    Topping topping = new Topping(data[1], Double.parseDouble(data[2]));
                    System.out.printf("%.2f%n", topping.calculateCalories());
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    return;
                }

                input = sc.readLine();
            }
        }
    }
}
