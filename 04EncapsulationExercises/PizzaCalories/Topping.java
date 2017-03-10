package PizzaCalories;

public class Topping {
    private String type;
    private double weight;

    public Topping(String type, double weight) throws Exception {
        this.setType(type);
        this.setWeight(weight);
    }

    public String getType() {
        return type;
    }

    private void setType(String type) throws Exception {
        if (type == null ||
                !type.toLowerCase().equals("meat") &&
                        !type.toLowerCase().equals("veggies") &&
                        !type.toLowerCase().equals("cheese") &&
                        !type.toLowerCase().equals("sauce")) {
            throw new Exception(String.format("Cannot place %s on top of your pizza.", type));
        }

        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) throws Exception {
        if (weight < 1 || weight > 50) {
            throw new Exception(String.format("%s weight should be in the range [1..50].", this.getType()));
        }
        this.weight = weight;
    }


    public double getCalories() {
        double typeModifier = getTypeModifier();
        return (2 * this.getWeight()) * typeModifier;
    }

    private double getTypeModifier() {
        double typeModifier = 0.0;

        switch (this.getType().toLowerCase()) {
            case "meat":
                typeModifier = 1.2;
                break;
            case "veggies":
                typeModifier = 0.8;
                break;
            case "cheese":
                typeModifier = 1.1;
                break;
            case "sauce":
                typeModifier = 0.9;
                break;
        }
        return typeModifier;
    }
}
