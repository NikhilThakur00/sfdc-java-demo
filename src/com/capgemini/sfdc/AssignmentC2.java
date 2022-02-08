package com.capgemini.sfdc;

import java.util.Scanner;

public class AssignmentC2 
{
	public static void main(String[] args)
	{  Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
	System.out.println("program to find bigger no in given two no");
	System.out.println("Enter the first no:");
	int num1=sc1.nextInt();
	System.out.println("Enter the second no:");
	int num2=sc2.nextInt();
	int num3;	
	num3= num1<num2?num1:num2;
	System.out.println(num3);
			
	}
}
