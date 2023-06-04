package com.Lambda.Ref;

interface IReference1 {
	void Display();
}

public class First {
	public void myMethod() {
		System.out.println("Instance method");
	}
	
	public static void main (String[] args) {
		First first = new First();
		IReference1 iref = first::myMethod;
		iref.Display();
	}
}
