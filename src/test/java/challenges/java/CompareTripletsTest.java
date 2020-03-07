package challenges.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CompareTripletsTest {
	
	@Test
	public void testing() {
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(3,2,1));
		System.out.println(CompareTriplets.compareTriplets(a, b));
		
		/*List<Integer> a = new ArrayList<Integer>(Arrays.asList(17,28,30));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(99,16,8));
		System.out.println(CompareTriplets.compareTriplets(a, b));*/
	}
}
