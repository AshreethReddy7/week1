package day3;
import java.util.Scanner;
public class strAnagram {
	public static void main(String[] args) {
		//Java Program To Check Whether Two Strings Are Anagram
		// listen
		// silent
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		char eachCh = ' ';
		boolean isAnagram = false;
		if(str1.length() == str2.length()) {
			for(int i=0;i<str1.length();i++) {
				eachCh = str1.charAt(i);
				if(isCharThere(str2,eachCh) == true) {
					isAnagram = true;
				}// if
				else {
					isAnagram = false;
					break;
				}
			}// for
				
		}//if
		
		if(isAnagram == true) System.out.println("Yes it is Anagram");
		else System.out.println("Not Anagram");
	}

	private static boolean isCharThere(String str2, char eachCh) {
		
		char Ch1 = ' ';
		for(int i=0;i<str2.length();i++) {
			Ch1 = str2.charAt(i);
			if(Ch1 == eachCh) {
				return true;
			}
		}
		
		
		return false;
	}

}