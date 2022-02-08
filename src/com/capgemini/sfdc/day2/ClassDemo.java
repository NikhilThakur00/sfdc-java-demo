package com.capgemini.sfdc.day2;

class BankCustomer{
	
	static String ifsc;
	int acNo;
	String customerName;
	double balance;
	//other fields
	
	//checkBalance(){}
	//withdraw(){}
	//deposit(){}
	//static viewInterestRate(){}
	//static openNewAccount(){}
}

public class ClassDemo {
	 public static void main(String[] args) {
		BankCustomer.ifsc="SBIN32345";//static belong to the class so the are accessed by the class name
		System.out.println(BankCustomer.ifsc);
		BankCustomer obj= new BankCustomer();
		obj.acNo=23476789;
		System.out.println(obj.acNo);//non static are accessed by the help of object of class
//		System.out.println(BankCustomer.acNo);//it will give compilation error
	}

}
