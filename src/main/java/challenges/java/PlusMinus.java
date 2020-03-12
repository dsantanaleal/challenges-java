package challenges.java;

import java.text.DecimalFormat;
import java.util.Arrays;

public class PlusMinus {
	static void plusMinus(int[] arr) {
		long lower = Arrays.stream(arr).filter(i->i < 0).count();
		long greater = Arrays.stream(arr).filter(i->i > 0).count();
		long equals = arr.length - lower - greater;
		DecimalFormat df = new DecimalFormat("##0.000000");
		System.out.println(df.format((double)greater/arr.length));
		System.out.println(df.format((double)lower/arr.length));
		System.out.println(df.format((double)equals/arr.length));
    }
}
