package Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] studentData = reader.readLine().split("\\s+");
        String firstName = studentData[0];
        String lastName = studentData[1];
        String facultyNumber = studentData[2];

        String[] workerData = reader.readLine().split("\\s+");
        String workerFirstName = workerData[0];
        String workerLastName = workerData[1];
        double weekSalary = Double.valueOf(workerData[2]);
        double hoursPerDay = Double.valueOf(workerData[3]);

        try {
            Student student = new Student(firstName, lastName, facultyNumber);
            Worker worker = new Worker(workerFirstName, workerLastName, weekSalary, hoursPerDay);
            System.out.println(student);
            System.out.println(worker);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
