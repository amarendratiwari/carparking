package com.car.parking.application.model;

import java.util.ArrayList;

public abstract class ParkingLot {
	
	protected Car cars[];
            
	private int size;
	public ParkingLot(int size) {
		cars = new Car[size];
	}
	public void bookSlot(Car c) {
		parkingSlots.add(c);
		
	}
	public void clearSlot(Car c) {
		parkingSlots.remove(c);
		
	}
	
}
