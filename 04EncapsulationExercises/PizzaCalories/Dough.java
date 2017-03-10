package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) throws Exception {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public String getFlourType() {
        return flourType;
    }

    private void setFlourType(String flourType) throws Exception {
        if (flourType == null ||
                !flourType.toLowerCase().equals("white") &&
                        !flourType.toLowerCase().equals("wholegrain")) {
            throw new Exception("Invalid type of dough.");
        }

        this.flourType = flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    private void setBakingTechnique(String bakingTechnique) throws Exception {
        if (bakingTechnique == null ||
                !bakingTechnique.toLowerCase().equals("crispy") &&
                        !bakingTechnique.toLowerCase().equals("chewy") &&
                        !bakingTechnique.toLowerCase().equals("homemade")) {
            throw new Exception("Invalid type of dough.");
        }


        this.bakingTechnique = bakingTechnique;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) throws Exception {
        if (weight < 1 || weight > 200) {
            throw new Exception("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    public double getCalories() {
        double flourTypeModifier = getFlourTypeModifier();
        double bakingTechniqueModifier = getBakingTechniqueModifier();

        return (2 * this.getWeight()) * flourTypeModifier * bakingTechniqueModifier;
    }

    private double getBakingTechniqueModifier() {
        double bakingTechniqueModifier;
        if (this.getBakingTechnique().toLowerCase().equals("crispy")) {
            bakingTechniqueModifier = 0.9;
        } else if (this.getBakingTechnique().toLowerCase().equals("chewy")) {
            bakingTechniqueModifier = 1.1;
        } else {
            bakingTechniqueModifier = 1.0;
        }
        return bakingTechniqueModifier;
    }

    private double getFlourTypeModifier() {
        double flourTypeModifier;
        if (this.getFlourType().toLowerCase().equals("white")) {
            flourTypeModifier = 1.5;
        } else {
            flourTypeModifier = 1.0;
        }
        return flourTypeModifier;
    }
}
