package com.capgeminisfdc;

import java.util.Scanner;

public class AssignmentC7 {
	public static void main(String[] args) 
	{System.out.println("Factorial of a given no.:");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.:");
		int num=sc.nextInt();
		int fact=1;
		int i;
		for(i=1;i<=num;i++) {
			fact= fact*i;
		}
		System.out.println("Factorial of "+num "is"+fact);
}
}