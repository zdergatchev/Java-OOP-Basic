package WildFarm;
public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.setAnimalName(animalName);
        this.setAnimalType(animalType);
        this.setAnimalWeight(animalWeight);
        this.setFoodEaten(0);
    }
    public String getAnimalName() {
        return this.animalName;
    }

    protected void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    protected void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getAnimalWeight() {
        return this.animalWeight;
    }

    protected void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public int getFoodEaten() {
        return this.foodEaten;
    }

    protected void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    protected abstract void makeSound();

    protected abstract void eat(Food food);
}
