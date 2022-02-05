package com.capgeminisfdc;

import java.util.Random;

public class AssignmentC4 
{public static void main(String[] args) 
	{System.out.println("Random interger between 1 to 100: ");
	int max=100;
	int min=1;
	Random randomNum= new Random();
	int no= min + randomNum.nextInt(max);
	System.out.println("the random no is "+ no);
	
	}

	
}
