package day3;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] num= {1,7,2,18,11,12,80};
		int max=num[0],min=num[0];
		
		for(int a=1;a<num.length;a++) {
			if(num[a]>max) {
				max=num[a];
				
			}
			if(num[a]<min) {
				min=num[a];
				
			}
		}
		System.out.println("max---->"+max);
		System.out.println("min---->"+min);
		
	}

}
