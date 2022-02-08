package com.capgeminisfdc.day2;

public class CalcDemo 
{  	public static void printNum() 
		{    int num=10;
	        System.out.println("printNum ie -NANR"+num);
		}
	public static void printSum(int a, int b) 
		{    int sum;
		     sum=a+b;
		     System.out.println("printSum ie -WANR"+sum);
		}
	public static int returnNum () 
	{    int num=10;
	    return num; 
	}
	public static int printSum2(int a, int b) 
	{    int sum;
	     sum=a+b;
	     return sum;
	}
	public static void main(String[] args)
	{printNum();
	 printSum(10,20);
	 int ret;
	 ret=returnNum();
	 System.out.println(ret);
	 int sum2;
	 sum2=printSum2(12,34);
	 System.out.println(sum2);
	 
	
	}

}
