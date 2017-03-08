package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private int toppingsAmount;
    private List<Topping> toppings;

    public Pizza(String name, int toppingsAmount) {
        this.setName(name);
        this.setToppingsAmount(toppingsAmount);
        toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.equals("") && name.length() <= 15) {
            this.name = name;
        } else {
            throw new NumberFormatException("Pizza name should be between 1 and 15 symbols");
        }
    }

    public double totalCalories() {
        Double sum = 0d;

        sum += dough.calculateCalories();
        for (int i = 0; i < this.toppings.size(); i++) {
            sum += this.toppings.get(i).calculateCalories();
        }

        return sum;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void createDough(Dough dough) {
        this.dough = dough;
    }


    public String getName() {
        return name;
    }

    private int getToppingsAmount() {
        return toppingsAmount;
    }

    private void setToppingsAmount(int toppingsAmount) {
        if (toppingsAmount >= 1 && toppingsAmount <= 10) {
            this.toppingsAmount = toppingsAmount;
        } else {
            throw new NumberFormatException("Number of toppings should be in range [0..10].");
        }
    }
}
