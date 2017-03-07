package OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    List<Person> personList = new LinkedList<>();

    for(int i = 0; i < n; i++){
        String[] input = reader.readLine().split("\\s+");
        String name = input[0];
        int age = Integer.parseInt(input[1]);
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        personList.add(person);
    }

    personList.stream().filter(p ->p.getAge()>30)
            .sorted((p1, p2) -> p1.getName()
            .compareTo(p2.getName()))
            .forEach(p ->System.out.printf("%s - %d%n",p.getName(),p.getAge()));
    }
}
