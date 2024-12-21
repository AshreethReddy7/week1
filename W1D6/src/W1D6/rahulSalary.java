package W1D6;
import java.util.Scanner;
public class rahulSalary {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter no of colonies");
	        int numColonies = sc.nextInt();
	        for (int i=0;i<numColonies;i++) {
	        	System.out.println("enter no of buildings");
	        	int numBuildings = sc.nextInt();
	        	System.out.println("earnings per building");
	            int earningsPerBuilding = sc.nextInt();
	            System.out.println("enter heights");
	            int[] heights = new int[numBuildings];
	            for (int j=0;j<numBuildings; j++) {
	                heights[j] = sc.nextInt();
	            }
	            int maxHeight = 0; 
	            int visibleBuildings = 0; 
	            for (int height : heights) {
	                if (height > maxHeight) {
	                    visibleBuildings++;
	                    maxHeight = height;	                   	                    
	                }
	            }
	            int totalEarnings = visibleBuildings * earningsPerBuilding;
	            System.out.println("total earnings");
	            System.out.println(totalEarnings);
	        }
	    }
}
