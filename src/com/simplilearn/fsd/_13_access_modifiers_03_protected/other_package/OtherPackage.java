package com.simplilearn.fsd._13_access_modifiers_03_protected.other_package;

import com.simplilearn.fsd._13_access_modifiers_03_protected.same_package.MyClass;

public class OtherPackage extends MyClass {
	void doSomething2() {
		this.num = 4;
		this.doSomething();
	}

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		//obj.num = 4;
		//obj.doSomething();
	
	}

}
