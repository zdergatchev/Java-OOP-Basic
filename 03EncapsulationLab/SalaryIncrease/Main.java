package SalaryIncrease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            persons.add(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
        }

        int bonus = Integer.parseInt(reader.readLine());
        for (Person person : persons) {
            person.increaseSalary((double)bonus);
            System.out.println(person.toString());
        }
    }
}
