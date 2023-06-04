package com.Lambda.Ref;

import java.util.ArrayList;
import java.util.List;

public class Comp {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		
		
		System.out.println("\n===== Lambda =====");
		fruits.forEach(
			fruit -> System.out.println(fruit)
		);
		
		System.out.println("\n===== Method Reference =====");
		fruits.forEach(System.out::println);
		
	}
	
	

}
