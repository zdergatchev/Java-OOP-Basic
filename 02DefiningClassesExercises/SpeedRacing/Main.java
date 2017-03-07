package SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            Double fuelAmount = Double.parseDouble(input[1]);
            Double fuelConsumption = Double.parseDouble(input[2]);

            Car car = new Car(model, fuelAmount, fuelConsumption);
            cars.put(car.getModel(), car);
        }

        String command;

        while (!"End".equals(command = reader.readLine())){
            String[] commandArgs = command.split("\\s+");
            String model = commandArgs[1];
            int distance = Integer.parseInt(commandArgs[2]);

            Car car = cars.get(model);
            car.drive(distance);
        }

        cars.values().forEach(System.out::println);
    }
}
