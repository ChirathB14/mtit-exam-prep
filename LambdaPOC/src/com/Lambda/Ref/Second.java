package com.Lambda.Ref;

interface IReference2 {
	void display();
}

public class Second {
	
	public static void staticMethod() {
		System.out.println("Static Method Display");
	}
	
	public static void main(String[] args) {
		IReference2 iref = Second::staticMethod;
		iref.display();
	}

}
