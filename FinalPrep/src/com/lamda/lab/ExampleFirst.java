package com.lamda.lab;

import java.util.stream.IntStream;

public class ExampleFirst {
	
	public static void main(String[] args) {
		loopOldWay();
		System.out.println();
		loopNewWay();
		System.out.println();
		loopNewWay2();
	}
	
	public static void loopOldWay() {
		for(int num =1 ; num <=10; num++) {
			System.out.println("Loop old print: " + num);
		}
	}
	
	public static void loopNewWay() {
		IntStream.iterate(1,  num -> num+1).limit(10).forEach(num -> System.out.println("Loop new print: " + num));
	}
	
	public static void loopNewWay2() {
		IntStream.iterate(10, n -> n-1).limit(10).forEach(n-> System.out.println("loop new inverse: " + n));
	}

}
