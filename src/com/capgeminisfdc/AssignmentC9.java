package com.capgeminisfdc;

import java.util.Scanner;

public class AssignmentC9 
	{ public static void main(String[] args) 
		{System.out.println("Fibonacci series of a given number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.println("Fibonacci series is :");
		System.out.print(n1+" "+n2);
		for (int i=2; i<=num;i++) 
		{n3=n1+n2;
		System.out.print(" "+n3);	
		n1=n2;
		n2=n3;
		}
    
     
	}
}