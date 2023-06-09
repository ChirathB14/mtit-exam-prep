package com.lamda.lab;

import java.util.ArrayList;
import java.util.List;

interface ICaculateService{
	public int caculateTotal(List<Integer> listOfMarks);
}

public class Example2 implements ICaculateService {
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(85);
		listOfMarks.add(75);
		listOfMarks.add(60);
		listOfMarks.add(80);
		listOfMarks.add(100);
//		
//		ICaculateService iCal = total ->  listOfMarks.stream().mapToInt(Integer::intValue).sum();
//		;
//		System.out.println("Total marks using lambda: " + iCal.caculateTotal(listOfMarks));
		
		int total = example2.caculateTotal(listOfMarks);
		System.out.println("Total marks: " + total);
	}

	@Override
	public int caculateTotal(List<Integer> listOfMarks) {
		int total = 0;
		for(Integer mark: listOfMarks) {
			total += mark;
		}
		return total;
	}

}
