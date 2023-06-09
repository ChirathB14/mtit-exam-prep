package com.lamda.exam22.Thread;

import java.util.ArrayList;

public class ConsumerThread implements Runnable{
	ArrayList<Integer> list ;
	
	public ConsumerThread(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
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
	}
}
