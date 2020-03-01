package challenges.java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CamelCaseTest {
	@Test
	public void test() {
		String tests[] = {"estaEsUnaPrueba", "esta", "estaEsTTodaUnaPrueba", "aSuVez", "estaEsUnaPruebaAsiEsConTodo"};
		int expected[] = {4, 1, 6, 3, 8};
		int actual[] = new int[expected.length];
        for(int i = 0; i < tests.length; i++) {
            actual[i] = CamelCase.camelcase(tests[i]);
        }
        assertArrayEquals(expected, actual);
	}
}