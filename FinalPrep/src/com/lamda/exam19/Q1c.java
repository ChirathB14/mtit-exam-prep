package com.lamda.exam19;

import java.util.ArrayList;
import java.util.List;

interface Ivehicle1 {
	void displayVehicles();
}

public class Q1c {
	public static void main(String[] args) {
		Ivehicle1 iv1 = () -> {
			List<String> vehicles = new ArrayList<String>();
			vehicles.add("Car");
			vehicles.add("Bike");
			vehicles.add("Van");
			
//			vehicles.forEach(e-> System.out.println(e));
			vehicles.forEach(System.out::println);
		};
		
		iv1.displayVehicles();
	}
}
