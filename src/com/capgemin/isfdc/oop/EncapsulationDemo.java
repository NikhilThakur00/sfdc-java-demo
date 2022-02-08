// OOP - Object Oriented Programming 
// Encapsulation 
// Abstraction 
// Inheritance 
// Polymorphism 

package com.capgemin.isfdc.oop;
//Encapsulation - bind data (fields / variables) and code (methods) together 
//create private fields and create public methods (getters and setters) to access those fields 


//Abstraction - minimum necessary representation - not related to keyword "abstract"
//hide unnecessary details and show only the required functionality


class Employee {
	
	private int employeeId;
	private String firstName;
	private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {// right click on the workspace  then source the n generate getters and setters
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

class BankCustomer {

	private double balance;
	// other fields

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	
}

public class EncapsulationDemo {
	public static void main(String[] args) {
	BankCustomer customer1 = new BankCustomer();
	customer1.deposit(1000);
	System.out.println(customer1.getBalance());
	customer1.withdraw(600);
	System.out.println(customer1.getBalance());
//	customer1.balance = 1500; // not allowed
	System.out.println(customer1.getBalance());
}

}
