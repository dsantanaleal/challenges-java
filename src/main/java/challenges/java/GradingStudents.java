package challenges.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream().map(x -> {
            if(x < 38) {
                return x;
            }
            int nextRounded = ((x / 5) + 1) * 5;
            int diff = nextRounded - x;
            if(diff < 3) {
                return nextRounded;
            }
            return x;
        }).collect(Collectors.toList());
    }

    public static void main(String args[]) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        List<Integer> results = gradingStudents(grades);
        System.out.println(grades);
        System.out.println(results);
    }
}
