package Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Person> personByName = new HashMap<>();

        String command = in.nextLine();
        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");
            String personName = tokens[0];

            Person person = null;
            if (!personByName.containsKey(personName)) {
                person = new Person(personName);
            } else {
                person = personByName.get(personName);
            }

            String commandType = tokens[1];
            switch (commandType) {
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    Company company = new Company(companyName, department, salary);

                    person.updateCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);

                    person.addPokemon(pokemon);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];
                    Parent parent = new Parent(parentName, parentBirthday);

                    person.addParent(parent);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];
                    Child child = new Child(childName, childBirthday);

                    person.addChild(child);
                    break;
                case "car":
                    String carModel = tokens[2];
                    int carSpeed = Integer.parseInt(tokens[3]);
                    Car car = new Car(carModel, carSpeed);

                    person.updateCar(car);
                    break;
            }

            personByName.put(personName, person);
            command = in.nextLine();
        }

        String searchedName = in.nextLine();

        Person person = personByName.get(searchedName);
        System.out.println(person.getName());

        System.out.println("Company:" );
        if (person.getCompany() != null) {
            System.out.println(person.getCompany());
        }

        System.out.println("Car:");
        if (person.getCar() != null) {
            System.out.println(person.getCar());
        }

        System.out.println("Pokemon:");
        if (person.getPokemons().size() > 0) {
            for (Pokemon pokemon : person.getPokemons()) {
                System.out.println(pokemon);
            }
        }

        System.out.println("Parents:");
        if (person.getParents().size() > 0) {
            for (Parent parent : person.getParents()) {
                System.out.println(parent);
            }
        }

        System.out.println("Children:");
        if (person.getChildren().size() > 0) {
            for (Child child : person.getChildren()) {
                System.out.println(child);
            }
        }
    }
}
