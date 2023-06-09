package com.lamda.exam22.Thread;

import java.util.ArrayList;

public class ThreadMainLambda {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Thread producer = new Thread(() -> {
			synchronized (list) {
				int value = 0;
				
				while (true) {
					System.out.println("Producer started...");
					
					try {
						value +=10;
						list.add(value);
						System.out.println("Prodcuer adding " + value + " to queue");
						list.wait();
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					list.notify();
					System.out.println("Elements in queue: " + list);
				}
			}
		});
		
		
		Thread consumer = new Thread(()->{
			synchronized (list) {	
				while (true) {
					System.out.println("Consumer started...");
					try {
						System.out.println("Consumer thread consumes: " + list.remove(0));
					} catch(IndexOutOfBoundsException e) {
						e.printStackTrace();
					}
					list.notify();
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		
		producer.start();
		consumer.start();
		
	}
	
	
	

}
