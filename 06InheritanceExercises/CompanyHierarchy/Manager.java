package CompanyHierarchy;

import java.util.HashSet;
import java.util.Set;

public class Manager extends Employee {
    private Set<Employee> employees;

    public Manager(Integer id, String firstName, String lastName, Double salary, Department department) {
        super(id, firstName, lastName, salary, department);
        this.employees = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employees=" + employees +
                '}';
    }
}
