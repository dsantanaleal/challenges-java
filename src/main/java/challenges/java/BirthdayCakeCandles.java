package challenges.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        candles.sort(Comparator.reverseOrder());
        int getFirst = candles.get(0);
        return (int) candles.stream().filter(val -> val == getFirst).count();
    }

    public static void main(String args[]) {
        birthdayCakeCandles(Arrays.asList(3,2,1,3));
        birthdayCakeCandles(Arrays.asList(4,4,1,3));
    }
}
