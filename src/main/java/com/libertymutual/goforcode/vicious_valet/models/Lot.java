package com.libertymutual.goforcode.vicious_valet.models;

import java.util.ArrayList;

public class Lot {

	private ArrayList<Car> carList;
	private int capacity;

	public Lot(int c) {

		carList = new ArrayList<Car>();
		capacity = c;

	}

	public ArrayList<Car> getCarList() {
		return carList;
	}

	public void addCar(Car car) {
		if (!isFull()) {
			carList.add(car);
		}
	}

	public boolean isFull() {
		if (capacity <= carList.size()) {
			
			return true;
		} else {
			return false;
		}
	}
	public int getCarAmount() {
		return carList.size();
	}
 
	public int getCapacity() {
		return capacity;
	}
	
}
