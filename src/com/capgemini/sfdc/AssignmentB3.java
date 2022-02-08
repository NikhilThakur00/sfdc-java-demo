package com.capgemini.sfdc;
import java.util.Scanner;
public class AssignmentB3 {

	public static void main(String[] args) 
	{	int r ,sum=0,num, temp;
		System.out.println("program to check weather a given no. is palindrome or not ");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no:");
		num=sc.nextInt();
		temp=num;
		while(num>0) 
		{ r=num%10;
		   sum=(sum*10)+r;
			num=num/10;
		}
		if (temp==sum)
			System.out.println("palindrom number");
		else
			System.out.println("Not palindrom number");
	}
}