package com.simplilearn.fsd._07_inheritance;



class Person {  //Parent - Base - Super class
	String name;
	int age;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}
	
	
}

class Customer extends Person{
	
}


//DRY Principal - Don't repeat yourself (re-use code)
class Employee extends Person{  // Child - Derived- Sub class
	int id;
	double salary;
	String position;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return String.format("Employee [id=%s, salary=%s, position=%s, name=%s, age=%s]", id, salary, position, name,
				age);
	}
	
	/*
	 *  Overriding is the situation where a method inherited is overwritten in the child
	 *  class 
	 *  Overriding is a type of Polymorphism
	 */
	
	
}
	



public class Inheritance {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		
		emp1.setId(1);
		emp1.setName("Joe");
		emp1.setAge(40);
		emp1.setSalary(120000);
		emp1.setPosition("Architecht");
		
		
		//Customer cus1 = new Customer();
		
		System.out.println(emp1.toString());
		
		//Person per1 = new Person();
		
		//per1.
		
	}

}
