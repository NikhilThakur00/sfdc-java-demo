package com.capgemini.sfdc;
import java.util.Scanner;
public class AssignmentC3 
{public static void main(String[] args)
	{int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any integer number");
	num=sc.nextInt();
	System.out.println("smallest even no greater the the no. is:");
	if(num%2==0){
		System.out.println(num+2);
		}
	else{
		System.out.println(num+1);
	}
	System.out.println("biggest odd no smaller then the no is");
	if(num%2==0){
		System.out.println(num-1);
		}
	else{
		System.out.println(num-2);
	}	
	
	
	}

}
