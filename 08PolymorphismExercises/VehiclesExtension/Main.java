package VehiclesExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Vehicle car = null;
    public static Vehicle truck = null;
    public static Vehicle bus = null;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            createVehicles(reader);
        }

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {

            try {
                executeCommand(reader);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static void executeCommand(BufferedReader reader) throws IOException {
        String[] input = reader.readLine().trim().split("\\s+");
        String command = input[0];
        String vehicleType = input[1];
        switch(command.toLowerCase()) {
            case "drive":
                double distance = Double.parseDouble(input[2]);
                switch(vehicleType.toLowerCase()) {
                    case "car":
                        car.drive(distance);
                        break;
                    case "truck":
                        truck.drive(distance);
                        break;
                    case "bus":
                        bus.setFuelConsumption(bus.getFuelConsumption() + ((Bus)bus).getMoreConsumption());
                        bus.drive(distance);
                        break;
                }
                break;
            case "driveempty":
                distance = Double.parseDouble(input[2]);
                bus.drive(distance);
                break;
            case "refuel":
                double refuelQuantity = Double.parseDouble(input[2]);
                switch(vehicleType.toLowerCase()) {
                    case "car":
                        car.refuel(refuelQuantity);
                        break;
                    case "truck":
                        truck.refuel(refuelQuantity);
                        break;
                    case "bus":
                        bus.refuel(refuelQuantity);
                        break;
                }
                break;
        }

    }

    public static void createVehicles(BufferedReader reader) throws IOException {
        String[] input = reader.readLine().trim().split("\\s+");
        String vehicleType = input[0];
        double fuelQuantity = Double.parseDouble(input[1]);
        double fuelConsumption = Double.parseDouble(input[2]);
        double tankCapacity = Double.parseDouble(input[3]);
        switch(vehicleType.toLowerCase()) {
            case "car":
                car = new Car(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "truck":
                truck = new Truck(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "bus":
                bus = new Bus(fuelQuantity, fuelConsumption, tankCapacity);
                break;
        }
    }
}
