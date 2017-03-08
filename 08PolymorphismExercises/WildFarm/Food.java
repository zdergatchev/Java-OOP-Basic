package WildFarm;

public abstract class Food {
    private int foodQuantity;

    public Food(int foodQuantity) {
        this.setFoodQuantity(foodQuantity);
    }

    protected void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public int getFoodQuantity() {
        return this.foodQuantity;
    }
}
