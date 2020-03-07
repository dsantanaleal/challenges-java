package challenges.java;

import java.util.Arrays;

public class VeryBigSum {
	// Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
    	return Arrays.stream(ar).reduce(0, (a,b) -> a + b);
    }
}
