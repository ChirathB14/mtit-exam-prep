package com.lamda.exam22;

import java.util.Arrays;

public class ThirdType {
	public static void main(String[] args) {
		String[] array = {"sSS", "rrR", "aaa"};
		
//		Arrays.sort(array, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareToIgnoreCase(o2);
//			}
//			
//		});
//		
//		for (String value: array) {
//			System.out.println(value);
//		}
		
		Arrays.sort(array, String::compareToIgnoreCase);
		
		Arrays.stream(array).forEach(System.out::println);
	}
}
