package com.capgemini.sfdc;

import java.util.Scanner;

public class AssignmentC12 
{public static void main(String[] args) 
	{System.out.println("Swap the value of two given number");
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	int num1,num2 ,temp;
	System.out.println("Enter the first number:");
	num1=sc1.nextInt();
	System.out.println("Enter the second number:");
	num2=sc2.nextInt();
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("Swapped first number:"+num1);
	System.out.println("Swapped second number:"+num2);
	}

}
