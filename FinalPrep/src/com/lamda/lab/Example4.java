package com.lamda.lab;

import java.util.stream.IntStream;

public class Example4 {
	
	public static void main(String[] args) {
		System.out.println("Threads old apporach...");
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i <= 10; i++) {
					System.out.println("Threads old way: " + i);
				}
				
			}
		};
		new Thread(r1).start();
		
		
		System.out.println("Thread new way 1...");
		Runnable r2 = () -> {
			IntStream.iterate(0, n -> n+1).limit(10).forEach(n -> System.out.println("Thread new way1: " + n));
		};
		new Thread(r2).start();
		
		
		System.out.println("Thread new way 2...");
		new Thread(
					() -> {
						IntStream.iterate(0, n2 -> n2 +1).limit(10).forEach(n2 -> System.out.println("Thread new way2: " + n2));
					}
				).start();
		
	}

}
