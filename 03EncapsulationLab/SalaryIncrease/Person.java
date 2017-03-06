package SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;

    public Person(String firstName, String lastName, Integer age, Double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getAge() {
        return this.age;
    }


    public Double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " get " + this.getSalary() + " leva";
    }

    public void increaseSalary(Double bonus){
        if(this.age > 30) {
            this.salary += this.salary * bonus / 100;
        } else {
            this.salary += this.salary * bonus / 200;
        }
    }
}
