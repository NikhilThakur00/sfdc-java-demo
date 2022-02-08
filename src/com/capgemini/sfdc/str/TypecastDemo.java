package com.capgemini.sfdc.str;

public class TypecastDemo {
	//byte int char short whenever there is arthimetical operations in there the automatically change to int
	public static void main(String[] args) {
	   byte b1=10,b2=20, b3= (byte)(b1+b2);
	   System.out.println(b3);
	   byte b4=-128;//-128-127
	   
	   System.out.println("byte range- ");
		System.out.println(Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("short range- ");
		System.out.println(Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("int range- ");
		System.out.println(Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("long range- ");
		System.out.println(Long.MIN_VALUE + " to " + Long.MAX_VALUE);
	}
}
