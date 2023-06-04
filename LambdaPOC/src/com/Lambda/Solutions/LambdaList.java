package com.Lambda.Solutions;

import java.util.Arrays;
import java.util.List;

public class LambdaList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		for(Integer n : list) {
			System.out.println(n);
		}
		
		//using lambda
		System.out.println("\n====== Lambda ======");
		list.forEach(
		number -> System.out.println(number)
		);
		
		// Method Reference
		System.out.println("\n ===== Method Reference =====");
		list.forEach(System.out::println);
	}
}
