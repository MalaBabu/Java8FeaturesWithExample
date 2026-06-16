package com.techtalkathon.interfacefeatures.defaultmethod;

public class TestClass {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Car car= new Car();
		
		System.out.println(bike.speed());
		System.out.println(bike.type());
		bike.start(); // Vehicle is started
		
		System.out.println("****************************************************************");
		System.out.println(car.speed());
		System.out.println(car.type());
		car.start(); // Vehicle is started 
	}
}
