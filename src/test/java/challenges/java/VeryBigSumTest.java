package challenges.java;

import java.util.Random;

import org.junit.Test;

public class VeryBigSumTest {
	static Random r = new Random();
	@Test
	public void testing() {
		for(int i = 0; i < 100; i++) {
			VeryBigSum.aVeryBigSum(prepareData(Math.abs(r.nextInt(100))));
		}
	}
	
	public static long[] prepareData(int items) {
		long numbers[] = new long[items];
		for(int i = 0; i < items; i++) {
			numbers[i] = r.nextLong();
		}
		return numbers;
	}
}
