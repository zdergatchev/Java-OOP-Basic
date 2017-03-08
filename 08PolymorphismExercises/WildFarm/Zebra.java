package WildFarm;
import java.text.DecimalFormat;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, String animalLivingRegion) {
        super(animalName, animalType, animalWeight, animalLivingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("Zs");
    }

    @Override
    protected void eat(Food food) {
        if(food.getClass().getSimpleName().toLowerCase().equals("meat")) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }

        super.setFoodEaten(super.getFoodEaten() + food.getFoodQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.######");
        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(), format.format(super.getAnimalWeight()), super.getLivingRegion(), super.getFoodEaten());
    }
}
