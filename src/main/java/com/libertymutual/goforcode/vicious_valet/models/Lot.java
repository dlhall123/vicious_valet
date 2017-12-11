package com.libertymutual.goforcode.vicious_valet.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToMany(mappedBy = "lot")
	private List<Car> carList;
	private int capacity;

	public Lot(int c) {

		carList = new ArrayList<Car>();
		capacity = c;

	}

	public List<Car> getCarList() {
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

	public int getCapacity() {
		return capacity;
	}

	public void removeCar(int i) {
		carList.remove(i - 1);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCarList(ArrayList<Car> carList) {
		this.carList = carList;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
