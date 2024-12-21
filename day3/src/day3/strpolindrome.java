package day3;
import java.util.Scanner;
public class strpolindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data");
		String data=sc.next();
		char ch;
		String newStr="";
		for(int i=data.length()-1;i>=0;i--) {
			ch=data.charAt(i);
			newStr=newStr+ch;
		}
		System.out.println("new str--->"+newStr);
		
	}

}
