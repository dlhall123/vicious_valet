package com.libertymutual.goforcode.vicious_valet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Lot lot;

	private String license;
	private String state;
	private String color;
	private String make;
	private String model;

	public Car(String license, String state, String color, String make, String model) {
		this.license = license;
		this.state = state;
		this.color = color;
		this.make = make;
		this.model = model;
	}

	public String getLicense() {
		return license;
	}

	public String getState() {
		return state;
	}

	public String getColor() {
		return color;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

}
