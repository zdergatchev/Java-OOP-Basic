package WildFarm;
import java.text.DecimalFormat;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, String animalLivingRegion) {
        super(animalName, animalType, animalWeight, animalLivingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    protected void eat(Food food) {
        if(food.getClass().getSimpleName().toLowerCase().equals("meat")) {
            throw new IllegalArgumentException("Mouses are not eating that type of food!");
        }
        System.out.println("A cheese was just eaten!");
        super.setFoodEaten(super.getFoodEaten() + food.getFoodQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.######");
        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(), format.format(super.getAnimalWeight()), super.getLivingRegion(), super.getFoodEaten());
    }
}
