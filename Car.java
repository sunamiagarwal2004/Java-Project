package com.groot;

public class Car {
	int carModel;
	String carName;
	String color;
	
	public Car(int carModel, String carName, String color) {
		this.carModel = carModel;
		this.carName = carName;
		this.color = color;
	}
	public Car(int carModel, String carName) {
		this.carModel = carModel;
		this.carName = carName;
	}
 public static void main(String[] args) {
	Car c =new Car(2332, "Volvo");
	Car cs= new Car(6060,"Alto","Blue");
	System.out.println(cs.carModel);
	System.out.println(cs.carName);
	System.out.println(cs.color);
}
}
