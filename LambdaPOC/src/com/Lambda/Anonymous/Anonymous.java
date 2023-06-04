package com.Lambda.Anonymous;

interface IGreetService{
	void greet();
	
	static void sayGoodBye() {
		System.out.println("GoodBye!");
	}
	
	default void greetDay() {
		System.out.println("Have a good day!");
	}
}

public class Anonymous {
	public static void main(String[] args) {
		IGreetService iGreetService = () -> {System.out.println("Hello, Good morning!");};
		iGreetService.greet();
		IGreetService.sayGoodBye();
		iGreetService.greetDay();
	}

}
