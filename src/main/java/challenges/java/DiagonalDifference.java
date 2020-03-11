package challenges.java;

import java.util.List;

public class DiagonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
		int lastJ = arr.get(0).size()-1;
		int j=0;
		int res = 0;
		for(int i = 0; i < arr.size(); i++) {
			res += arr.get(i).get(j++) - arr.get(i).get(lastJ--);
		}
		return Math.abs(res);
	}
}
