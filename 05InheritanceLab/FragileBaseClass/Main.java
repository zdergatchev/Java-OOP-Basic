package FragileBaseClass;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Predator predator = new Predator();
        predator.feedAll(new Food[] { new Food(), new Food()});
        predator.feed(new Food());
        System.out.println();
    }
}
