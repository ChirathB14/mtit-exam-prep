package com.Lambda.Variable;

@FunctionalInterface
interface HelloService {
	void sayHello();
}

public class Binding {
	public static void main(String[] args) {
		Binding binding = new Binding();
		binding.method();
	}
	
	void method() {
		final int count = 16;
		Runnable r = () -> {System.out.println("Count: " + count);};
		Thread t = new Thread(r);
		t.start();
//		count++;
	}
}
