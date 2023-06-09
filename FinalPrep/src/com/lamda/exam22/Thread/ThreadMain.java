package com.lamda.exam22.Thread;

import java.util.ArrayList;

public class ThreadMain {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		final Thread producer = new Thread(new ProducerThread(list));
		final Thread consumer = new Thread(new ConsumerThread(list));
		
		producer.start();
		consumer.start();
	}

}
