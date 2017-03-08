package AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) throws Exception {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new Exception("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0 || age > 15) {
            throw new Exception("Age should be between 0 and 15.");
        }

        this.age = age;
    }


    @Override
    public String toString() {
        String eggsToPrint = "";
        if (this.getAge() <= 5) {
            eggsToPrint = "2";
        } else if (this.getAge() >= 6 && this.getAge() <= 11) {
            eggsToPrint = "1";
        } else {
            eggsToPrint = "0.75";
        }

        return String.format("Chicken %s (age %d) can produce %s eggs per day.", this.getName(), this.getAge(), eggsToPrint);
    }
}
