package challenges.java;

public class StrongPassword {
	// Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    	final String numbers = "0123456789";
    	final String lower_case = "abcdefghijklmnopqrstuvwxyz";
    	final String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	final String special_characters = "!@#$%^&*()-+";
    	
    	int missingChars = 0;
    	missingChars += numbers.chars().anyMatch(ch -> password.contains(Character.toString((char)ch))) ? 0 : 1;
    	missingChars += lower_case.chars().anyMatch(ch -> password.contains(Character.toString((char)ch))) ? 0 : 1;
    	missingChars += upper_case.chars().anyMatch(ch -> password.contains(Character.toString((char)ch))) ? 0 : 1;
    	missingChars += special_characters.chars().anyMatch(ch -> password.contains(Character.toString((char)ch))) ? 0 : 1;
    	
    	int expectedChars = n + missingChars;
    	if(expectedChars < 6) {
    		missingChars += 6 - expectedChars;
    	}
    	return missingChars;
    }
}
