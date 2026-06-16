package com.techtalkathon.interfacefeatures.defaultmethod;

public interface VehicleDefaultMethodFeature {

	abstract double speed();

	abstract String type();
	
	default void start() {
		System.out.println("Vehicle is started");
	}// default method which can be accessible by all the sub classes .
}
