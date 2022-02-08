package com.capgemini.sfdc;
import java.util.Scanner;
public class AssignmentC1
{
	public static void main(String[] args) 
	{   Scanner sc1=new Scanner(System.in);
	    Scanner sc2=new Scanner(System.in);
		System.out.println("program to find bigger no in given two no");
		System.out.println("Enter the first no:");
		int num1=sc1.nextInt();
		System.out.println("Enter the second no:");
		int num2=sc2.nextInt();
		if(num1>num2) 
		{
			System.out.println(num1);
		}
		if(num2>num1) 
		{
			System.out.println(num2);
		}


    }
}