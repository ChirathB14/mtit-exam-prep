package com.Lambda.Lab;

import java.util.stream.IntStream;

public class ExampleLoop {
	public static void main(String[] args) {
		loopOldWay();
		System.out.println();
		loopNewWay();
	}
	
	public static void loopOldWay() {
		for(int num = 10; num >= 1; num--) {
			System.out.println("Loop old print: " + num);
		}
	}
	
	public static void loopNewWay() {
		IntStream.iterate(10, num2-> num2-1).limit(10).
			forEach(num2 -> System.out.println("Loop new print: " + num2));
	}
}
