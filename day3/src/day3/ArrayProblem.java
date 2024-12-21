package day3;

import java.util.Scanner;

public class ArrayProblem {

	public static void main(String[] args) {
		
		int[] num;
		Scanner sc=new Scanner(System.in);
		/*
		 * write a program to filter duplicate numbers
		 */
		
		System.out.println("enter total no size");
		int size=sc.nextInt();
		num=new int[size];
		System.out.println("enter all"+(size+1)+"number");
		for(int p=0;p<size;p++) {
			num[p]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]+" ");
				}
				
			}
		}
		
	}

}
