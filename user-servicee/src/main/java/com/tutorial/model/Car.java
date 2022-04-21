package com.tutorial.model;


public class Car {

	private String brand;

	private String model;

	private int userId;

	
	
	
	public Car(String brand, String model, int userId) {
		super();
		this.brand = brand;
		this.model = model;
		this.userId = userId;
	}
	public Car() {
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
