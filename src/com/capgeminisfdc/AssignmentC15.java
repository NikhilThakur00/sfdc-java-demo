package com.capgeminisfdc;

import java.util.Scanner;

public class AssignmentC15 
{public static void main(String[] args)
	{System.out.println("Check if no is prime or not");
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num=sc.nextInt();
	 int temp=0;
	 int i;
	 for(i=2;i<num;i++) {
		 if (num%i==0) {temp=temp+1;
		 }
		 
	 }
	if(temp==0) {
		System.out.println("Given no is a prime number");
	}
	else {
		System.out.println("Given no is not a prime number");
	}
}
}
