package com.simplilearn.fsd._02_operators_relational;

public class Relational {

	public static void main(String[] args) {

		int a = 10;
		int b = 8;
		
		//We should ONLY use relational operators with primitives
		boolean equalTo = (a==b); // Equal to Operators, used only to compare booleans
		boolean notEqual = (a!=b); // Not Equal to Operators, used only to compare booleans
		boolean gterThan = (a > b); //
		boolean lessThan = (a < b); // 
		boolean gThanEqu = (a >= b); // 
		boolean lThanEqu = (a <= b); // 
		
		System.out.println("equal To " +equalTo);
		System.out.println("Not Equal To "+notEqual);
		System.out.println("Greater Than "+gterThan);
		System.out.println("Less Than "+lessThan);
		System.out.println("Greater than Equal "+gThanEqu);
		System.out.println("Less than Equal "+lThanEqu);
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		/*Java thinks you want to compare the memory address of the non-primitive
		variables*/
		boolean bstr = s1==s2;
		System.out.println(bstr);
		
	}

}
