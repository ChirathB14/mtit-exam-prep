package com.Lambda.Solutions;

public class LambdaThread {
	public static void main(String[] args) {
		
		new Thread(
				new Runnable() {
					public void run() {
						System.out.println("Old way of creating thread");
					}
				}
		).start();
		
		new Thread(
		() -> System.out.println("New way of creating a thread") 
		).start();
	}

}
