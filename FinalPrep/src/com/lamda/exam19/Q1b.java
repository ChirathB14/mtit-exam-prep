package com.lamda.exam19;

//public class Q1b implements Runnable{
//
//	@Override
//	public void run() {
//		for (int row = 1; row <= 5; row++) {
//			for (int column = 1; column <= 5; column++) {
//				System.out.print(column);
//			}
//			System.out.println();
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		Thread thread = new Thread(new Q1b());
//		thread.start();
//	}
//
//}

public class Q1b{
	
	public static void main(String[] args) {
		Runnable r2 = () -> {
			for (int row = 1; row <= 5; row++) {
				for (int column = 1; column <= 5; column++) {
					System.out.print(column);
				}
				System.out.println();
			}
		};
		new Thread(r2).start();
	}

}
