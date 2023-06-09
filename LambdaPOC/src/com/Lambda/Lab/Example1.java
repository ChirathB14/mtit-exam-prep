package com.Lambda.Lab;

interface MyFunctionalInterface{
	public String sayHello();
}

public class Example1 {
	public static void main(String[] args) {
		MyFunctionalInterface msg = () -> "Hello";
		System.out.println(msg.sayHello());
	}
}
