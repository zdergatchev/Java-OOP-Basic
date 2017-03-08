package Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    private static final double MORE_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + MORE_CONSUMPTION);
    }


    @Override
    protected void drive(double distance) {
        double fuelNeed = distance * super.getFuelConsumption();
        if (super.getFuelQuantity() - fuelNeed > 0) {
            super.setFuelQuantity(super.getFuelQuantity() - fuelNeed);
            System.out.println(String.format("Car travelled %s km", new DecimalFormat("0.######").format(distance)));
        } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    protected void refuel(double refuelQuantity) {
        super.setFuelQuantity(super.getFuelQuantity() + refuelQuantity);
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", super.getFuelQuantity());
    }
}

