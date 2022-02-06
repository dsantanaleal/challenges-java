package challenges.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {


    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        long min = arr.subList(0, 4).stream().mapToLong(value -> value).sum();
        long max = arr.subList(1, 5).stream().mapToLong(value -> value).sum();
        System.out.printf("%d %d%n", min, max);
    }

    public static void main(String args[]) {
        miniMaxSum(Arrays.asList(1,2,3,4,5));
        miniMaxSum(Arrays.asList(1,3,5,7,9));
    }
}
