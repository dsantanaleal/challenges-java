package challenges.java;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CompareTriplets {
	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	AtomicInteger i = new AtomicInteger(0);
    	AtomicInteger A = new AtomicInteger(0);
    	AtomicInteger B = new AtomicInteger(0);
    	a.stream().forEach(itemA -> {
    		int itemB = b.get(i.getAndIncrement());
    		if(itemA > itemB) {
    			A.set(A.get()+1);
    		} else if(itemA < itemB) {
    			B.set(B.get()+1);
    		}
    	});
    	return Arrays.asList(A.get(), B.get());
    }
}
