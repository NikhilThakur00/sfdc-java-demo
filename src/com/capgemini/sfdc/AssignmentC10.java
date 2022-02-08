package com.capgemini.sfdc;

import java.util.Scanner;

public class AssignmentC10
{public static void main(String[] args)
	{System.out.println("Sum of all the integers greater than 100 and "
			+ "and less than 200 that are divisible by 7");
	Scanner sc= new Scanner(System.in);
	int i,sum=0;
	System.out.println("Sum of the integers is: ");
	for (i=100;i<=200;i++)
	{  if (i%7==0)
		{sum=sum + i;
		}; 
	}
	System.out.println(sum);
	}

}
