package com.capgemini.sfdc;

import java.util.Scanner;

public class AssignmentC8 
{public static void main(String[] args) 
	{
	System.out.println("Reverse of a given number");
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num =sc.nextInt();
	 int temp;
	 while(num!=0) 
	 	{temp =num%10;
	 	 System.out.print(temp);
	 	num=num/10;
	 	}
	 	}

}
