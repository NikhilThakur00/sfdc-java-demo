package com.capgemini.sfdc.str;
//wrapper classes are basically used to provide pramtive data types some functionalities

//wrapper classes 
//int - Integer
//byte - Byte
//char - Character 

public class WrapperDemo {
	public static void main(String[] args) {

//		String str = "abc";
////		str.
//		int num = 10;
////		num.

//		Integer num = 10;
//		System.out.println(num.intValue());

		String str = "100";
		String str2 = "200";
		String str3;

		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		int num3 = num1 + num2;
		str3 = Integer.toString(num3);
		System.out.println(str3);
		
		double d=Double.parseDouble(str);
		double d1=Double.parseDouble(str2);
		double d2= d+d1;
		System.out.println(d2);
//		char 
		char ch= Character.toUpperCase('e'); 
		
		long ln=Long.parseLong(str);
		long ln1=Long.parseLong(str2);
		long ln3=ln-ln1;
		System.out.println(ln3);
		

	}
}
