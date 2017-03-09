package Animals;

public class Frog extends Animals {
    protected Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void produceSound() {
        System.out.println("Frogggg");
    }
}
