package VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle{
    private static final double MORE_CONSUMPTION = 1.4;
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity){
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public double getMoreConsumption() {
        return MORE_CONSUMPTION;
    }

    @Override
    public void drive(double distance) {
        double fuelNeed = distance * super.getFuelConsumption();
        if(super.getFuelQuantity() - fuelNeed > 0) {
            super.setFuelQuantity(super.getFuelQuantity() - fuelNeed);
            System.out.println(String.format("Bus travelled %s km", new DecimalFormat("0.######").format(distance)));
        } else {
            System.out.println("Bus needs refueling");
        }
    }

    public void driveEmpty(double distance) {
        this.drive(distance);
    }

    @Override
    protected void refuel(double refuelQuantity) {
        if(super.getFuelQuantity() + refuelQuantity > super.getTankCapacity()){
            //super.setFuelQuantity(super.getTankCapacity());
            System.out.println("Cannot fit fuel in tank");
        }else{
            super.setFuelQuantity(super.getFuelQuantity() + refuelQuantity);
        }
    }

    @Override
    public String toString() {
        return String.format("Bus: %.2f", super.getFuelQuantity());
    }
}
