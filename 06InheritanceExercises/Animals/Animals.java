package Animals;

public class Animals {
    private String name;
    private int age;
    private String gender;

    protected Animals(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid input!");
        }

        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }

        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    private void setGender(String gender) {
        if ((gender == null) || (!gender.toLowerCase().equals("male") && !gender.toLowerCase().equals("female"))) {
            throw new IllegalArgumentException("Invalid input!");
        }

        this.gender = gender;
    }

    protected void produceSound() {
        System.out.println("Not implemented!");
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", this.getName(), this.getAge(), this.getGender());
    }
}

