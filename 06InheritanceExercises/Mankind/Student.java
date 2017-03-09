package Mankind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student extends Human{
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return this.facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        String regex = "[^a-zA-Z0-9\\s]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(facultyNumber);
        if (facultyNumber.length() < 5 ||
            facultyNumber.length() > 10 ||
                matcher.find()) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s\nLast Name: %s\nFaculty number: %s\n",
                this.getFirstName(),
                this.getLastName(),
                this.getFacultyNumber()));
        return sb.toString();
    }

}
