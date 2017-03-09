package Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();
        while (!command.equals("Beast!")) {
            String animalKind = command;
            String[] animalArgs = reader.readLine().split("\\s+");
            if (animalArgs.length >= 2) {
                String name = animalArgs[0];
                int age = Integer.parseInt(animalArgs[1]);

                Animals animal = null;
                try {
                    if (animalKind.equals("Animal")) {
                        if (animalArgs.length == 3) {
                            String gender = animalArgs[2];
                            animal = new Animals(name, age, gender);
                        }
                    } else if (animalKind.equals("Dog")) {
                        if (animalArgs.length == 3) {
                            String gender = animalArgs[2];
                            animal = new Dog(name, age, gender);
                        }
                    } else if (animalKind.equals("Cat")) {
                        if (animalArgs.length == 3) {
                            String gender = animalArgs[2];
                            animal = new Cat(name, age, gender);
                        }
                    } else if (animalKind.equals("Kitten")) {
                        animal = new Kittens(name, age, "Female");
                    } else if (animalKind.equals("Tomcat")) {
                        animal = new Tomcat(name, age, "Male");
                    } else if (animalKind.equals("Frog")) {
                        if (animalArgs.length == 3) {
                            String gender = animalArgs[2];
                            animal = new Frog(name, age, gender);
                        }
                    }

                    if (animal == null) {
                        System.out.println("Invalid input!");
                    }
                    else {
                        System.out.println(animalKind);
                        System.out.println(animal);
                        animal.produceSound();
                    }
                } catch (Exception iae) {
                    System.out.println(iae.getMessage());
                }
            }
            command = reader.readLine();
        }
    }
}
