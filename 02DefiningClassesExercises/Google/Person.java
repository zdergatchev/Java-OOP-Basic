package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;
    private Car car;

    public Person(String name) {
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();

        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return this.company;
    }

    public void updateCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public boolean addPokemon(Pokemon pokemon) {
        return this.getPokemons().add(pokemon);
    }

    public List<Parent> getParents() {
        return this.parents;
    }

    public boolean addParent(Parent parent) {
        return this.getParents().add(parent);
    }

    public List<Child> getChildren() {
        return this.children;
    }

    public boolean addChild(Child child) {
        return this.getChildren().add(child);
    }

    public Car getCar() {
        return this.car;
    }

    public void updateCar(Car car) {
        this.car = car;
    }
}
