package com.lamda.lab;

@FunctionalInterface
interface MyFunctionalInterface {
	public String sayHello();
}

public class Example1 {
	
	public static void main(String[] args) {
		MyFunctionalInterface myFuncInt = () -> "Hello" ;
		System.out.println(myFuncInt.sayHello());
	}

}
