package FamilyTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String searchedPersonData = in.nextLine();
        Person searchedPerson = new Person();

        Map<String, Person> personByName = new HashMap<>();
        Map<String, Person> personByBirthday = new HashMap<>();
        List<String> allInputData = new ArrayList<>();

        String command = in.nextLine();
        while (!"End".equals(command)) {
            if (command.contains("-")) {
                allInputData.add(command);
            } else {
                String[] personData = command.split("\\s+");
                String name = personData[0] + " " + personData[1];
                String birthday = personData[2];

                if (name.equals(searchedPersonData) || birthday.equals(searchedPersonData)) {
                    searchedPerson.setName(name);
                    searchedPerson.setBirthday(birthday);
                } else {
                    Person person = new Person(name, birthday);
                    personByName.put(name, person);
                    personByBirthday.put(birthday, person);
                }
            }

            command = in.nextLine();
        }

        for (String data : allInputData) {
            String[] tokens = data.split(" - ");

            if (tokens[0].equals(searchedPerson.getName()) || tokens[0].equals(searchedPerson.getBirthday()) ||
                    tokens[1].equals(searchedPerson.getName()) || tokens[1].equals(searchedPerson.getBirthday())) {
                String parentData = tokens[0];
                String childData = tokens[1];

                if (childData.equals(searchedPerson.getName()) || childData.equals(searchedPerson.getBirthday())) {
                    Person parent = null;

                    if (personByName.containsKey(parentData)) {
                        parent = personByName.get(parentData);
                    }

                    if (personByBirthday.containsKey(parentData)) {
                        parent = personByBirthday.get(parentData);
                    }

                    searchedPerson.addParent(parent);
                } else if (parentData.equals(searchedPerson.getName()) || parentData.equals(searchedPerson.getBirthday())) {
                    Person child = null;

                    if (personByName.containsKey(childData)) {
                        child = personByName.get(childData);
                    }

                    if (personByBirthday.containsKey(childData)) {
                        child = personByBirthday.get(childData);
                    }

                    searchedPerson.addChild(child);
                }
            }
        }

        System.out.println(searchedPerson);
        System.out.println("Parents:");
        for (Person person : searchedPerson.getParents()) {
            System.out.println(person);
        }
        System.out.println("Children:");
        for (Person person : searchedPerson.getChildren()) {
            System.out.println(person);
        }
    }
}
