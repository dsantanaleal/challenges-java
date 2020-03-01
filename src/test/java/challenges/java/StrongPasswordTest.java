package challenges.java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class StrongPasswordTest {
	@Test
	public void test() {
		String cases[] = {"Ab1", "#HackerRank", "Ab#1", "", "AbCd!9", "0123456789!@#$%^&*()-+abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"};
		int expected[] = {3, 1, 2, 6, 0, 0};
		int actual[] = new int[expected.length];
        for(int i = 0; i < cases.length; i++) {
            actual[i] = StrongPassword.minimumNumber(cases[i].length(), cases[i]);
        }
        assertArrayEquals(expected, actual);
	}
}
