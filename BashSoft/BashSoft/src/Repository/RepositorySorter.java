package Repository;

import java.util.*;
import java.util.stream.Collectors;
import IO.OutputWriter;
import StaticData.ExceptionMessages;

public class RepositorySorter {
    public void printSortedStudents(
            HashMap<String, Double> studentWithMarks,
            String comparisonType,
            Integer numberOfStudents)
    {
        comparisonType = comparisonType.toLowerCase();
        if (!comparisonType.equals("ascending") && !comparisonType.equals("descending")) {
            OutputWriter.displayException(ExceptionMessages.INVALID_COMPARISON_QUERY);
            return;
        }

        Comparator<Map.Entry<String, Double>> comparator = (x, y) -> {
            double value1 = x.getValue();
            double value2 = y.getValue();
            return Double.compare(value1, value2);
        };

        List<String> sortedStudents = studentWithMarks.entrySet()
                .stream()
                .sorted(comparator)
                .limit(numberOfStudents)
                .map(x -> x.getKey())
                .collect(Collectors.toList());

        if (comparisonType.equals("descending")){
            Collections.reverse(sortedStudents);
        }

        printStudents(studentWithMarks, sortedStudents);
    }

    private void printStudents(HashMap<String, Double> studentWithMarks, List<String> sortedStudents) {
        for (String student : sortedStudents) {
            OutputWriter.printStudent(student, studentWithMarks.get(student));
        }
    }
}
