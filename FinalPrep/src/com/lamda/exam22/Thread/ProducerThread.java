package com.lamda.exam22.Thread;

import java.util.ArrayList;

public class ProducerThread implements Runnable{
	
	ArrayList<Integer> list ;
	
	public ProducerThread(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
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
	}
}
