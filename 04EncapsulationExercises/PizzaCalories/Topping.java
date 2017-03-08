package PizzaCalories;

public class Topping {
    private String topingType;
    private double weight;

    public Topping(String topingType, double weight) {
        this.setTopingType(topingType);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new NumberFormatException(String.format("%s weight should be in the range [1..50].", this
                    .topingType));
        }
    }

    private void setTopingType(String topingType) {
        if (topingType.toLowerCase().equals("meat") ||
                topingType.toLowerCase().equals("veggies") ||
                topingType.toLowerCase().equals("cheese") ||
                topingType.toLowerCase().equals("sauce")) {
            this.topingType = topingType;
        } else {
            throw new NumberFormatException(String.format("Cannot place %s on top of your pizza.", topingType));
        }
    }

    public double calculateCalories() {
        Double result = this.weight * 2;

        switch (topingType.toLowerCase()) {
            case "meat":
                result *= 1.2d;
                break;
            case "veggies":
                result *= 0.8d;
                break;
            case "cheese":
                result *= 1.1d;
                break;
            case "sauce":
                result *= 0.9d;
                break;
        }
        return result;
    }
}



