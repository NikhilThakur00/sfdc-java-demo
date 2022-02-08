package com.capgeminisfdc.day2;

//access modifiers 
//public - accessible from anywhere in the app 
//protected - accessible from subclasses and from within the package 
//<default> (package) - accessible from within the package 
//private - accessible only from within the class


class AccessClass {
	
	public static int publicField;
	protected static int protectedField;
	static int packageField;
	private static int privateField;
	
	static void methodInTheSameClass() {
		System.out.println(AccessClass.publicField);
		System.out.println(AccessClass.protectedField);
		System.out.println(AccessClass.packageField);
		System.out.println(AccessClass.privateField);
	}
}

public class AcessDemo {public static void main(String[] args) {
	
}
	static void methodInOtherClass() {
		System.out.println(AccessClass.publicField);
		System.out.println(AccessClass.protectedField);
		System.out.println(AccessClass.packageField);
		//System.out.println(AccessClass.privateField);//it is not accessed outside the class even by the help of the objects of the class 
	}

}
