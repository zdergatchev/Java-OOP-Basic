package Google;

public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.setModel(model);
        this.setSpeed(speed);
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return this.getModel() + " " + this.getSpeed();
    }
}
