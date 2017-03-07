package CompanyRoster;

public class Employee extends Person{
    private final static String DEFAULT_EMAIL = "n/a";

    private double salary;
    private String position;
    private String department;
    private String email;

    public Employee(String name, double salary, String position, String department, String email, int age) {
        super(name, age);
        this.salary = salary;
        this.position  = position;
        this.department = department;
        this.email = email;
    }

    public Employee(String name, double salary, String position, String department) {
        super(name);
        this.salary = salary;
        this.position  = position;
        this.department = department;
        this.email = DEFAULT_EMAIL;
    }

    public Employee(String name, double salary, String position, String department, String email) {
        super(name);
        this.salary = salary;
        this.position  = position;
        this.department = department;
        this.email = email;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        super(name, age);
        this.salary = salary;
        this.position  = position;
        this.department = department;
        this.email = DEFAULT_EMAIL;
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", super.getName(), this.getSalary(), this.email, super.getAge());
    }
}
