package com.capgeminisfdc;

import java.util.Scanner;

public class AssignmentC13 
{public static void main(String[] args) 
	{System.out.println("Convert a given no of days into months and days");
	Scanner sc= new Scanner(System.in);
	int numM,numDay,numDay1;
	System.out.println("Enter the no of days ");
	numDay=sc.nextInt();
	numM=numDay/30;
	numDay1=numDay%30;
	System.out.println("no of months:"+numM);
	System.out.println("no of days :"+numDay1);
	}

}
