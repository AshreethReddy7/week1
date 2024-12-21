package patternprojects;

public class pattern4 {

	public static void main(String[] args) {
		for(int r=1;r<=20;r++) {
			System.out.print("\t");
			if(r==1||r==20) {
				for(int c=1;c<=30;c++) {
					System.out.print("*");
				}
			}
			else {
				for(int c=1;c<=30;c++) {
					if(c==1||c==30) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
					
			}
			System.out.println();
		}
		
	}

}
