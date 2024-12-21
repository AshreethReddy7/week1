package ashreeth;
import java.util.Scanner;
public class replaceNo {
	public static void main(String[] args) {
		int r,p=1,res=0;
		Scanner abc=new Scanner(System.in);
		System.out.println("enter number");
		int n=abc.nextInt();
		while(n!=0) {
			r=n%10;
			if(r==9)r=3;
			n=n/10;
			res=res+r*p;
			p=p*10;
			
		}
		System.out.println(res);

	}

}
