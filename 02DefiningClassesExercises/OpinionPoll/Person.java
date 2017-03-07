package OpinionPoll;

public class Person {
    private int age;
    private String name;

    public int getAge(){
        return  this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public Person(){
        this.name = "No name";
        this.age = 1;
    }

    public Person(int age){
        this();
        this.age = age;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
