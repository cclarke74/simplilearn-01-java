package com.simplilearn.fsd;

public class Variable {

	public static void main(String[] args) {
		
		//
		/*
		 Java has two variable types
		 1. primitive
		 2. non-primitives
		 */
		
		// Integer Data Types
		
		int a = 10; //<---Mostly used 4 bytes
		
		long b = Long.MAX_VALUE; // 8 bytes
		
		short c = 32767; // 2 bytes
		
		byte d = 127; // 1 bytes
		
		//Decimal Data Types
		
		double e = 3.4525999999; // 8 bytes
		float f = 3.4523123456F; // 4 bytes
		
		// Text Data Types
		
		char g = 'A';
		char[] s = {'S', 'i', 'm', 'p', 'l', 'i', 'l', 'e', 'a', 'r', 'n'};
		
		// Non-primitive so it's capitalized/ built in class
		String h = "Simplilearn";
		
		boolean i = false;
		
		//As of Java 11
		var j = 5.4; // from JS, not a primitive. not used often
		
		//j = 'Hello'; // Java won't allow
		
		System.out.println("The value c is " + c);
		System.out.println("The value d is " + d);
		System.out.println("The value e is " + e);
		System.out.println("The value f is " + f);
		System.out.println("The value g is " + g);
		System.out.println("The value h is " + h);
		System.out.println("The value s is " + new String(s));
		System.out.println("The value i is " + i);
		System.out.println("The value j is " + j);
	}

}
