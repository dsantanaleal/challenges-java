package challenges.java;

import java.io.UnsupportedEncodingException;
import java.util.stream.IntStream;

public class CamelCase {
	static int camelcase(String s) {
        int counter = 1;
        try {
            byte bytesSequence[] = s.getBytes("UTF-8");
            final int ascIIA = 65;
            final int ascIIZ = 90;
            long tempCount = IntStream.range(0, bytesSequence.length).mapToObj(i->bytesSequence[i]).filter(b-> b >= ascIIA && b <= ascIIZ).count();
            if (tempCount > 0) {
                counter += tempCount;
            }
        } catch (UnsupportedEncodingException e) {

        }
        return counter;
    }
}