package day3;

public class demo3 {

	public static void main(String[] args) {
		String data1="hello";
		String data2="hello";
		if(data1==data2) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
			
		}
		String data3=new String("hello");
		String data4=new String("hello");
		if(data1==data4) {
			System.out.println("from new same");
		}
		else {
			System.out.println("from new not");
		}
	}

}