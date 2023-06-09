package com.lamda.lab;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface IAverageService {
	public int getAverage(List<Integer> listOfMarks);
}

public class Example3 implements IAverageService{

//	public static void main(String[] args) {
//		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
//		listOfMarks.add(85);
//		listOfMarks.add(75);
//		listOfMarks.add(60);
//		listOfMarks.add(80);
//		listOfMarks.add(100);
//		
//		IAverageService iAvg = avg -> (listOfMarks.stream().mapToInt(Integer::intValue).sum())/ (listOfMarks.size());
//		System.out.println("Avrage by Lambda: " + iAvg.getAverage(listOfMarks));
//	}
	
	@Override
	public int getAverage(List<Integer> listOfMarks) {
		int total = 0;
		for (Integer mark: listOfMarks) {
			total += mark;
		}
		return (total/listOfMarks.size());
	}
	
	public static void main(String[] args) {
		Example3 ex3 = new Example3();
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(85);
		listOfMarks.add(75);
		listOfMarks.add(60);
		listOfMarks.add(80);
		listOfMarks.add(100);
		
//		IAverageService iAvg = avg -> (listOfMarks.stream().mapToInt(Integer::intValue).sum())/ (listOfMarks.size());
//		System.out.println("Avrage by Lambda: " + iAvg.getAverage(listOfMarks));
		int avg = ex3.getAverage(listOfMarks);
		System.out.println("Avarage by implementation: " + avg);
	}


}
