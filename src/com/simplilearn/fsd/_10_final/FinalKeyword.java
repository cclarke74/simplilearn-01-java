package com.simplilearn.fsd._10_final;

/*
 * The final modifier can be applied on Classes, Methods and Variables.
 */

/*
 * A final class cannot be extended.
 */
	
class Parent{
	
	/*
	 * A final method cannot be overridden in the child class
	 */
	void print() {
		System.out.println("I am the Parent class");
	}
}

class Child extends Parent{
	
	@Override
	void print() {
		System.out.println("I am the Child class");
	}

public class FinalKeyword {

	/*
	 * Instance Variable / Attribute / Property
	 */
	static final int NUM = 4;

	public static void main(String[] args) {
		
		//local variable can be final
		
		final int hello;
		
		hello = 5;
		
		

	}
	

}
}