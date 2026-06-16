package com.techtalkathon.interfacefeatures.defaultmethod;

public class Bike implements VehicleDefaultMethodFeature{

	@Override
	public double speed() {
		return 100;
	}

	@Override
	public String type() {
		return "Bike";
	}
	
//	public void start() {
//		System.out.println("Bike is started ");
//		
//	}

}
