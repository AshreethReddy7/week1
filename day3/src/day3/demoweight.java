package day3;
import java.util.Arrays;
public class demoweight {

	public static void main(String[] args) {
		String str1="15243";
		String str2="1234";
		 if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }

	    // Function to check if two strings are anagrams
	    public static boolean areAnagrams(String str1, String str2) {
	        // If lengths are not equal, they cannot be anagrams
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert strings to character arrays
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();

	        // Sort the character arrays
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        // Compare sorted arrays
	        return Arrays.equals(charArray1, charArray2);
	}

}
