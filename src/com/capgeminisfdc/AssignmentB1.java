package com.capgeminisfdc;
import java.util.Scanner;
public class AssignmentB1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no for factorial");
		int n= sc.nextInt();
		int fact=1;
		 System.out.println("factorial of "+ n+ "is:");
		for(int i=1; i<=n; i++) 
		{  fact=fact*i;
		    
		
	    }
		System.out.println(fact) ;	// TODO Auto-generated method stub

	}

}
