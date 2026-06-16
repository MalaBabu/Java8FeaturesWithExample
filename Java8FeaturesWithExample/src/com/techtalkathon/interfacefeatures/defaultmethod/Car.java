package com.techtalkathon.interfacefeatures.defaultmethod;
public class Car implements VehicleDefaultMethodFeature{
	@Override
	public double speed() {
		return 80;
	}
	@Override
	public String type() {
		return "Car";
	}
}
