package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new NumberFormatException("Dough weight should be in the range [1..200].");
        }
    }

    private void setFlourType(String flourType) {
        if (flourType.toLowerCase().equals("white") || flourType.toLowerCase().equals("wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new NumberFormatException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.toLowerCase().equals("crispy") ||
                bakingTechnique.toLowerCase().equals("chewy") ||
                bakingTechnique.toLowerCase().equals("homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new NumberFormatException("Invalid type of dough.");
        }
    }

    public double calculateCalories() {
        Double result = this.weight * 2;

        switch (flourType.toLowerCase()) {
            case "white":
                result *= 1.5d;
                break;
            case "wholegrain":
                result *= 1d;
        }

        switch (this.bakingTechnique.toLowerCase()) {
            case "crispy":
                result *= 0.9d;
                break;
            case "chewy":
                result *= 1.1d;
                break;
            case "homemade":
                result *= 1.0d;
                break;
        }
        return result;
    }
}


