package Mankind;

public class Worker extends Human {
    private Double weekSalary;
    private Double workingHoursPerDay;
    private Double salaryPerHour;

    public Worker(String firstName, String lastName,
                  Double weekSalary, Double workingHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkingHoursPerDay(workingHoursPerDay);
        this.setSalaryPerHour(weekSalary, workingHoursPerDay);
    }

    public Double getWeekSalary() {
        return this.weekSalary;
    }

    protected void setWeekSalary(Double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public Double getWorkingHoursPerDay() {
        return this.workingHoursPerDay;
    }

    protected void setWorkingHoursPerDay(Double workingHoursPerDay) {
        if (workingHoursPerDay < 1 || workingHoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.workingHoursPerDay = workingHoursPerDay;
    }

    public Double getSalaryPerHour() {
        return this.salaryPerHour;
    }

    protected void setSalaryPerHour(Double weekSalary, Double workingHoursPerDay) {
        this.salaryPerHour = (weekSalary / 7) / workingHoursPerDay;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s\nLast Name: %s\nWeek Salary: %.2f\nHours per day: %.2f\nSalary per hour: %.2f\n",
                this.getFirstName(),
                this.getLastName(),
                this.getWeekSalary(),
                this.getWorkingHoursPerDay(),
                this.getSalaryPerHour()));
        return sb.toString();
    }
}
