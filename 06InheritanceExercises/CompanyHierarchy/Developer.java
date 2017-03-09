package CompanyHierarchy;

import java.util.HashSet;
import java.util.Set;

public class Developer extends RegularEmployee {
    private Set<Project> projects;

    public Developer(Integer id, String firstName, String lastName, Double salary, Department department) {
        super(id, firstName, lastName, salary, department);
        this.projects = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Developer{" +
                "projects=" + projects +
                '}';
    }

}
