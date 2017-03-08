package Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    private static final double MORE_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + MORE_CONSUMPTION);
    }


    @Override
    protected void drive(double distance) {
        double fuelNeeded = distance * super.getFuelConsumption();
        if(super.getFuelQuantity() - fuelNeeded > 0) {
            super.setFuelQuantity(super.getFuelQuantity() - fuelNeeded);
            System.out.println(String.format("Truck travelled %s km", new DecimalFormat("0.######").format(distance)));
        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    protected void refuel(double refuelQuantity) {
        super.setFuelQuantity(super.getFuelQuantity() + (refuelQuantity * 0.95));
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", super.getFuelQuantity());
    }
}
