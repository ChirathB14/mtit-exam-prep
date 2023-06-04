package com.Lambda.Lab;

import java.util.stream.IntStream;

public class Example4 {
	public static void main(String[] args) {
		System.out.println("Threads Old way...");
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<=10; i++) {
					System.out.println("Threads old way: " + i);
				}
				
			}
		};
		new Thread(r1).start();
		
		
		System.out.println("Threads new way 1...");
		Runnable r2 = () -> {
			IntStream.iterate(1, num -> num+1).limit(10).forEach(num -> {
				System.out.println("Threads new way 1: " + num);
			});
		};
		new Thread(r2).start();
		
		
		System.out.println("Threads new way 2...");
		new Thread(() -> {
			IntStream.iterate(1, num1 -> num1+1).limit(10).forEach(num1 -> {System.out.println("Thread new way 2: "+num1);});
		}).start();
		
		
	}
}
