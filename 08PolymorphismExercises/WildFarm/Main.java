package WildFarm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static Animal animal = null;
    public static Food food = null;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while(!"End".equals(input = reader.readLine())) {
            String[] animalTokens = input.trim().split("\\s+");
            String[] foodTokens = reader.readLine().split("\\s+");
            executeProduceFood(foodTokens);
            try {
                executeCreateAnimal(animalTokens, food);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println(animal);
        }

    }

    private static void executeCreateAnimal(String[] animalTokens, Food food) {
        String animalType = animalTokens[0];
        String animalName = animalTokens[1];
        Double animalWeight = Double.parseDouble(animalTokens[2]);
        String animalLivingRegion = animalTokens[3];

        switch(animalType.toLowerCase()) {
            case "cat":
                String catBreed = animalTokens[4];
                animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
                animal.makeSound();
                animal.eat(food);
                break;
            case "tiger":
                animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                animal.makeSound();
                animal.eat(food);
                break;
            case "zebra":
                animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                animal.makeSound();
                animal.eat(food);
                break;
            case "mouse":
                animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                animal.makeSound();
                animal.eat(food);
                break;
        }

    }

    private static void executeProduceFood(String[] foodTokens) {
        String foodType = foodTokens[0];
        int foodQuantity = Integer.parseInt(foodTokens[1]);
        switch (foodType.toLowerCase()) {
            case "vegetable":
                food = new Vegetable(foodQuantity);
                break;
            case "meat":
                food  = new Meat(foodQuantity);

        }

    }
}

/*
Input 1:
Cat Gray 1.1 Home Persian
Vegetable 4
End

Output 1:
Meowwww
Cat[Gray, Persian, 1.1, Home, 4]


Input 2:
Tiger Typcho 167.7 Asia
Vegetable 1
End

Output 2:
ROAAR!!!
Tigers are not eating that type of food!
Tiger[Typcho, 167.7, Asia, 0]


Input 3:
Zebra Doncho 500 Africa
Vegetable 150
End

Output 3:
Zs
Zebra[Doncho, 500, Africa, 150]


Input 4:
Mouse Jerry 0.5 Anywhere
Vegetable 0
End

Output 4:
SQUEEEAAAK!
 Mouse[Jerry, 0.5, Anywhere, 0]





 */
