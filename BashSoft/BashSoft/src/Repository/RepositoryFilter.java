package Repository;

import IO.OutputWriter;
import StaticData.ExceptionMessages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Predicate;

public class RepositoryFilter {

    public void printFilteredStudents(HashMap<String, Double> studentWithMarks,
                                             String filterType,
                                             Integer numberOfStudents) {

        Predicate<Double> filter = createFilter(filterType);

        if (filter == null) {
            OutputWriter.displayException(ExceptionMessages.INVALID_FILTER);
            return;
        }

        int studentsCount = 0;

        for (String student : studentWithMarks.keySet()) {
            if (studentsCount >= numberOfStudents) {
                break;
            }


            Double mark = studentWithMarks.get(student);

            if (filter.test(mark)) {
                OutputWriter.printStudent(student, mark);
                studentsCount++;
            }
        }
    }

    private Predicate<Double> createFilter(String filterType) {
        switch (filterType) {
            case "excellent":
                return mark -> mark >= 5.0;
            case "average":
                return mark -> 3.5 <= mark && mark < 5.0;
            case "poor":
                return mark -> mark < 3.5;
            default:
                return null;
        }
    }
}
