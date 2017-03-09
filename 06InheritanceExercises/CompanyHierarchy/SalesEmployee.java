package CompanyHierarchy;

import java.util.HashSet;
import java.util.Set;

public class SalesEmployee extends RegularEmployee {
    private Set<Sale> sales;

    public SalesEmployee(Integer id, String firstName, String lastName, Double salary, Department department) {
        super(id, firstName, lastName, salary, department);
        this.sales = new HashSet<>();
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "sales=" + sales +
                '}';
    }

}
