package com.Lambda.Lab;

import java.util.ArrayList;
import java.util.List;

interface IAverageServices{
	public int getAverage(List<Integer> listOfMarks);
}

//public class Example3 {
//	public static void main(String[] args) {
//		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
//		listOfMarks.add(35);
//		listOfMarks.add(75);
//		listOfMarks.add(55);
//		IAverageServices iAvg = total -> (
//			listOfMarks.stream().mapToInt(Integer::intValue).sum()/(listOfMarks.size())
//		);
//		System.out.println("Total Marks using lambda: " + iAvg.getAverage(listOfMarks));
//	}
//}

public class Example3 implements IAverageServices{
	@Override
	public int getAverage(List<Integer> listOfMarks) {
		int total = 0;
		for(Integer n: listOfMarks){
			total += n;
		};
		
		return (total/listOfMarks.size());
	}
	
	public static void main(String[] args) {
		Example3 ex3 = new Example3();
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(35);
		listOfMarks.add(75);
		listOfMarks.add(55);
		
		int avg = ex3.getAverage(listOfMarks);
		System.out.println("Total Marks using implementation: " + avg );
	}
	
}
