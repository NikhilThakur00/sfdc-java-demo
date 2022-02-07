package com.capgeminisfdc;

import java.util.Scanner;

public class AssignmentC6 
{public static void main(String[] args) 
	{System.out.println("Sum and Product of the digits in given number");
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num = sc.nextInt();
	 int sum=0,product=1;
	 System.out.println("The sum of the digits is:");
	  while(num!=0) 
	 {   
		 sum = sum+num%10;
		 num=num/10;
	 }
	 System.out.println(sum);
	 System.out.println("The product of the digits is:");
	 while(num!=0) 
	 {   
		product = product*(num % 10);
		 num=num/10;
	 }
	 System.out.println(product);
		
		
	 }

}
