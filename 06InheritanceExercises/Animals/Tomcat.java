package Animals;

public class Tomcat extends Cat {
    protected Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void produceSound() {
        System.out.println("Give me one million b***h");
    }
}
