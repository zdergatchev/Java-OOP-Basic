package Person;

import java.util.IllegalFormatCodePointException;

public class Person {
    private String name;
    private int age;

    public Person(String name, Integer age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) throws IllegalArgumentException {
        if (name.length() < 3) {
            throw new NumberFormatException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    protected void setAge(Integer age) throws IllegalArgumentException {
        if (age < 1){
            throw new IllegalArgumentException("Age must be positive!");
        }
        if (age > 15){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        this.age = age;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Age: %d",
                        this.getName(),
                        this.getAge()));
        return sb.toString();
    }
}
