package com.capgemini.sfdc;

import java.util.Scanner;

public class AssignmentC11 
	{public static void main(String[] args) 
		{System.out.println("Multiplication Table of the given number");
		// TODO Auto-generated method stub
        int  i,num ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
           num = sc.nextInt();
        
       for (i=1 ; i<=10 ; i++)
       {
      	 System.out.println(i +"x"+num+"="  + num * i );
      	 
       }
		
		}

	}
