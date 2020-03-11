package challenges.java;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DiagonalDifferenceTest {
	
	@Test
	public void exampleTest1() {
		final Integer l[][] = {{1,2,3},{4,5,6},{9,8,9}};
		final int expected = 2;
		assertEquals(expected, DiagonalDifference.diagonalDifference(twoDArrayToList(l)));		
	}
	
	@Test
	public void exampleTest2() {
		final Integer l[][] = {{11,2,4},{4,5,6},{10,8,-12}};
		final int expected = 15;
		assertEquals(expected, DiagonalDifference.diagonalDifference(twoDArrayToList(l)));		
	}
	
	@Test
	public void littleMatrix() {
		final Integer l[][] = {{100,200},{-1,-20}};
		final int expected = 119;
		assertEquals(expected, DiagonalDifference.diagonalDifference(twoDArrayToList(l)));
	}
	
	@Test
	public void pairSizeMatrix() {
		final Integer l[][] = {{1,8,5,7},{3,2,4,3},{7,3,7,4},{9,4,6,3}};
		final int expected = 10;
		assertEquals(expected, DiagonalDifference.diagonalDifference(twoDArrayToList(l)));
	}
	
	@Test
	public void oddSizeMatrix() {
		final Integer l[][] = {{1,8,5,7,9},{3,2,4,3,2},{7,3,7,4,1},{9,4,6,3,2},{4,5,4,1,8}};
		final int expected = 6;
		assertEquals(expected, DiagonalDifference.diagonalDifference(twoDArrayToList(l)));
	}
	
	public static List<List<Integer>> twoDArrayToList(Integer[][] twoDArray) {
	    List<List<Integer>> list = new ArrayList();
	    for (Integer[] array : twoDArray) {
	        list.add(Arrays.asList(array));
	    }
	    return list;
	}
}
