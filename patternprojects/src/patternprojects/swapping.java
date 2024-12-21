package patternprojects;
import java.util.Scanner;
public class swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 names");
		String name1=sc.next();
		String name2=sc.next();
		System.out.println("before swapping");
		System.out.println("name1----->"+name1);
		System.out.println("name2----->"+name2);
		
		name1=name1+name2;
		name2=name1.substring(0,name1.length()-name2.length());
		name1=name1.substring(name2.length());
		
		System.out.println("after swapping");
		System.out.println("name1----->"+name1);
		System.out.println("name2----->"+name2);

	}

}
