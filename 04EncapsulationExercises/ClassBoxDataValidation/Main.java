package ClassBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        try{
            Box box = new Box(length, width, height);

            double surfaceArea = box.getSurfaceArea();
            System.out.printf("Surface Area - %.2f%n", surfaceArea);

            double lateralSurfaceArea = box.getLateralSurfaceArea();
            System.out.printf("Lateral Surface Area - %.2f%n", lateralSurfaceArea);

            double volume = box.getVolume();
            System.out.printf("Volume - %.2f%n", volume);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
