package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name = "";
    private String birthday = "";
    private List<Person> parents = new ArrayList<>();
    private List<Person> children = new ArrayList<>();

    public Person(){
    }

    public Person(String name, String birthday) {
        this.setName(name);
        this.setBirthday(birthday);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<Person> getParents() {
        return this.parents;
    }

    public void setParents(List<Person> parents) {
        this.parents = parents;
    }

    public List<Person> getChildren() {
        return this.children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void addParent(Person person) {
        this.getParents().add(person);
    }

    public void addChild(Person child) {
        this.getChildren().add(child);
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getBirthday();
    }

}
