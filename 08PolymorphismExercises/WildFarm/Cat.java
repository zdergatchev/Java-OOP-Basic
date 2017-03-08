package WildFarm;

import java.text.DecimalFormat;
public class Cat extends Felime {
    private String breed;

    public Cat (String animalName, String animalType, double animalWeight, String animalLivingRegion, String breed) {
        super(animalName, animalType, animalWeight, animalLivingRegion);
        this.setBreed(breed);
    }

    public String getBreed() {
        return this.breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    protected void eat(Food food) {
        super.setFoodEaten(super.getFoodEaten() + food.getFoodQuantity());
    }

    public String toString() {
        DecimalFormat format = new DecimalFormat("0.######");
        return String.format("%s[%s, %s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(), this.getBreed(), format.format(super.getAnimalWeight()), super.getLivingRegion(), super.getFoodEaten());
    }
}
