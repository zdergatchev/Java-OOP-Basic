package Vehicles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static Vehicle car = null;
    public static Vehicle truck = null;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 2; i++) {
            createVehicles(reader);
        }

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            executeCommand(reader);
        }

        System.out.println(car);
        System.out.println(truck);
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
                }
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
                }
                break;
        }
    }

    public static void createVehicles(BufferedReader reader) throws IOException {
        String[] input = reader.readLine().trim().split("\\s+");
        String vehicleType = input[0];
        double fuelQuantity = Double.parseDouble(input[1]);
        double fuelConsumption = Double.parseDouble(input[2]);
        switch(vehicleType.toLowerCase()) {
            case "car":
                car = new Car(fuelQuantity, fuelConsumption);
                break;
            case "truck":
                truck = new Truck(fuelQuantity, fuelConsumption);
                break;
        }
    }
}
