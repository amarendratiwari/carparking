package com.car.parking.application.model;

public class Car {
	private String color;
	private String numberPlate;

	public Car(String color, String numberPlate) {
		this.color = color;
		this.numberPlate = numberPlate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

}
