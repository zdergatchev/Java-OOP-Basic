package WildFarm;
import java.text.DecimalFormat;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, Double animalWeight, String animalLivingRegion) {
        super(animalName, animalType, animalWeight, animalLivingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    protected void eat(Food food) {
        if (food.getClass().getSimpleName().toLowerCase().equals("vegetable")) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }

        super.setFoodEaten(super.getFoodEaten() + food.getFoodQuantity());
    }

    public String toString() {
        DecimalFormat format = new DecimalFormat("0.######");
        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(), format.format(super.getAnimalWeight()), super.getLivingRegion(), super.getFoodEaten());
    }
}
