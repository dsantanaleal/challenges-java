package challenges.java;

public class Staircase {
	
	static void staircase(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(j>=n-i-1?"#":" ");
			}
			System.out.println();
		}
    }
}
