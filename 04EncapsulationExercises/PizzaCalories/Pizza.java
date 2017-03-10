package PizzaCalories;

public class Pizza {
    private String name;
    private Dough dough;
    private int numberOfToppings;
    private Topping[] toppings;

    private int indexCount;

    public Pizza(String name, int numberOfToppings) throws Exception {
        this.setName(name);
        this.setNumberOfToppings(numberOfToppings);
        this.setToppings(new Topping[numberOfToppings]);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) throws Exception {
        if (name.trim().length() == 0 || name.length() > 15) {
            throw new Exception("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    private void setNumberOfToppings(int numberOfToppings) throws Exception {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new Exception("Number of toppings should be in range [0..10].");
        }

        this.numberOfToppings = numberOfToppings;
    }

    public Topping[] getToppings() {
        return toppings;
    }

    private void setToppings(Topping[] toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Topping topping) {
        this.toppings[this.indexCount++] = topping;
    }

    private double getCalories() {
        double total = getTotal();

        return total;
    }

    private double getTotal() {
        double total = 0.0;
        total += this.dough.getCalories();
        for (Topping topping : this.getToppings()) {
            total += topping.getCalories();
        }

        return total;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", this.getName(), this.getCalories());
    }
}
