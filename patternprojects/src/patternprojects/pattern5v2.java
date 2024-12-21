package patternprojects;

public class pattern5v2 {

	static void design(int r,int p) {
		for(int c=1;c<=r;c++) {
			System.out.print((p++%2)+" ");
		}
	}
		

	public static void main(String[] abc) {
		for(int r=1;r<=4;r++) {
			        design(r,r%2);
			    System.out.println();
		}
	}

}
