package com.lamda.exam19;

import java.util.ArrayList;
import java.util.List;

interface ITrafficService {
	public String checkSpeed(List<Double> listOfCheckpoints);
}

//public class VehicleMonitor implements ITrafficService {
//
//	@Override
//	public String checkSpeed(List<Double> listOfCheckpoints) {
//		
//		double total = 0;
//		for (Double speed: listOfCheckpoints) {
//			total += speed;
//		}
//		
//		double avarageSpeed = total/listOfCheckpoints.size();
//		
//		if (avarageSpeed >= 100.0) {
//			return "Issue Fine";
//		} else if ((avarageSpeed < 100.0 ) && (avarageSpeed >= 80.0)) {
//			return "Warning";
//		} else {
//			return "Slow";
//		}
//	}
//	
//	public static void main(String[] args) {
//		VehicleMonitor vMonitor = new VehicleMonitor();
//		ArrayList<Double> speedInCheckpoint = new ArrayList<Double>();
//		speedInCheckpoint.add(20.0);
//		speedInCheckpoint.add(30.0);
//		speedInCheckpoint.add(160.0);
//		speedInCheckpoint.add(120.0);
//		
//		String result = vMonitor.checkSpeed(speedInCheckpoint);
//		System.out.println("Status: " + result);
//	}
//	
//}

public class VehicleMonitor{
	
	public static void main(String[] args) {
		ArrayList<Double> speedInCheckpoint = new ArrayList<Double>();
		speedInCheckpoint.add(20.0);
		speedInCheckpoint.add(30.0);
		speedInCheckpoint.add(160.0);
		speedInCheckpoint.add(120.0);
		
		ITrafficService iTrafService = (listOfCheckpoints) -> {

			double total = 0;
			for (Double speed: listOfCheckpoints) {
				total += speed;
			}
			
			double avarageSpeed = total/listOfCheckpoints.size();
			
			if (avarageSpeed >= 100.0) {
				return "Issue Fine";
			} else if ((avarageSpeed < 100.0 ) && (avarageSpeed >= 80.0)) {
				return "Warning";
			} else {
				return "Slow";
			}
		};
		
		String result = iTrafService.checkSpeed(speedInCheckpoint);
		System.out.println("Status lambda: " + result);
	}
	
}
