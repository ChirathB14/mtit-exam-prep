package com.Lambda.Lab;

import java.util.ArrayList;
import java.util.List;

interface ICalculateService {
	public int calculateTotal(List<Integer> listOfMarks);
}

//public class Example2 implements ICalculateService {
//	
//	@Override
//	public int calculateTotal(List<Integer> listOfMarks) {
//		int total = 0;
//		for(Integer mark : listOfMarks) {
//			total += mark;
//		}
//		return total;
//	}
//	
//	public static void main(String[] args) {
//		Example2 ex2 = new Example2();
//		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
//		listOfMarks.add(35);
//		listOfMarks.add(75);
//		listOfMarks.add(55);
//		
//		Integer total = ex2.calculateTotal(listOfMarks);
//		System.out.println("Total Marks using implementing: " + total);	
//	}
//}

public class Example2{
	
	
	public static void main(String[] args) {
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(35);
		listOfMarks.add(75);
		listOfMarks.add(55);
		
		ICalculateService iCal = total -> listOfMarks.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total Marks using lambda: " + iCal.calculateTotal(listOfMarks));	
	}
}
