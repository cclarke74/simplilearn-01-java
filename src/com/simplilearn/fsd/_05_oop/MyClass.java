package com.simplilearn.fsd._05_oop;

/*
 * 1. Attributes
 * 2. Constructors - blocks of code, special method to initialize that
 * we use to initialize objects.
 * 3. Methods - blocks of code
 */

class Employee {
	
	/*
	 * Attributes, Properties, Field, Instance Variables
	 */
	
	private int id;
	//String empCode; //EMP001A for example
	private String name;
	//String status; // A=Active, I=Inactive 
	private double salary; // supports decimal numbers
	private String position;
	
	
	/*
	 * A Constructor is a special method that is used to initialize objects.
	 * It is called automatically when we create the object.
	 * 
	 * Types:
	 * 1. Default Constructor: Created automatically by Java if the class doesn't have
	 * 						   any constructor.
	 * 2. No-Arg Constructor: A constructor that takes no parameters.
	 * 3. Parameterized Constructor: A constructor that takes parameters.
	 */
	
	//Default Constructor
	Employee() {
		this.id = 0;
		this.name = "";
		this.salary = 0.0;
		this.position = "";
		
	}
	
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}



	Employee(int id, String name, double salary, String position) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
	




	/*Mutators - Getters and Setters*/

	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id; // this removes ambiguity of which attribute
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	String getPosition() {
		return position;
	}
	void setPosition(String position) {
		this.position = position;
	}
	
	//Method is block of code that runs when it is called.
	//return type- method name - parameters
	void display() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
		System.out.println("position: " + position);
	}
	
	/*
	 * Method declaration- Method signature ( method name and parameter types)
	 * Method body inside curly braces
	 */
	double calculateBonus(double percentage) {
		
		double empBonus = salary * percentage / 100;
		
		/*
		 * Send the value to the DB
		 */
		
		return empBonus;
	}
}


public class MyClass {

	public static void main(String[] args) {
		
		//Emp1
		Employee emp1 = new Employee(); // Object or Instance of class Employee

//		emp1.id = 1020; // Breaking OOP concept - Encapsulation
//		emp1.name = "John";
//		emp1.salary = 80000;
//		emp1.position = "Manager";
		
		// calling the method
		emp1.display();
		
		double bonus = emp1.calculateBonus(10);
		System.out.println("Bonus: " + bonus);
		
		
		// Emp2- Using Getters and Setters
		Employee emp2 = new Employee();
		
		emp2.setId(1030);  // Encapsulation OOP - Concept
		emp2.setName("Jane");
		emp2.setSalary(100000);
		emp2.setPosition("Director");
		
		emp2.display();
		
		bonus = emp2.calculateBonus(5);
		System.out.println("Bonus: " + bonus);
		emp2.display();
		
		/* Emp3
		 * We have the data so we are using the constructor
		*/
		Employee emp3 = new Employee(1040,"Mike",90000,"Accountant");	
		
		emp3.display();
		bonus = emp3.calculateBonus(5);
		System.out.println("Bonus: " + bonus);
	
		
		/* Emp4
		 */
		Employee emp4 = new Employee(1045,"Hello");	
		emp4.setSalary(100000);
		emp4.setPosition("Director");
		
		
		
	}

}
