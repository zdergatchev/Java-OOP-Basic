package SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelConsumption;
    private int distanceTraveled;

    public Car (String model, double fuelAmount, double fuelConsumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.distanceTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public void drive (int distance) {
        double neededFuel = distance * this.fuelConsumption;
        if (neededFuel > this.fuelAmount) {
            System.out.println("Insufficient fuel for the drive");
            return;
        }
        this.setFuelAmount(this.getFuelAmount() - neededFuel);
        this.setDistanceTraveled(this.getDistanceTraveled() + distance);
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s", this.model, this.fuelAmount, this.distanceTraveled);
    }

}
