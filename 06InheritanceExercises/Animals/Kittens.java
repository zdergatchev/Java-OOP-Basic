package Animals;

public class Kittens extends Cat  {
    protected Kittens(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void produceSound() {
        System.out.println("Miau");
    }
}
