package com.Lambda.Ref;

import java.util.Arrays;

public class Third {
	public static void main(String[] args) {
		String[] stringArray = {"Sam", "Richard", "Chris", "Tom"};
		
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		
		for (String str: stringArray) {
			System.out.println(str);
		}
		
	}
}
