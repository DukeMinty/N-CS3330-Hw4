package edu.mu.vehicle;

import java.text.NumberFormat;

public abstract class Vehicle {

	protected String brand;
	protected String make;
	protected long modelYear;
	protected double price;
	protected VehicleColor color;
	protected FuelType fuelType;
	protected double mileage;
	protected double mass;
	protected int cylinders;
	protected double gasTankCapacity;
	protected StartMechanism startType;

	// Constructors
	public Vehicle(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {

		this.brand = brand;
		this.make = make;
		this.modelYear = modelYear;
		this.price = price;
		this.color = color;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.mass = mass;
		this.cylinders = cylinders;
		this.gasTankCapacity = gasTankCapacity;
		this.startType = startType;
	}

	public Vehicle(Vehicle original) {
		brand = original.getBrand();
		make = original.getMake();
		modelYear = original.getModelYear();
		price = original.getPrice();
		color = original.getColor();
		fuelType = original.getFuelType();
		mileage = original.getMileage();
		mass = original.getMass();
		cylinders = original.getCylinders();
		gasTankCapacity = original.getGasTankCapacity();
		startType = original.getStartType();
	}

	// Abstract methods
	public abstract double calculateMaintenanceCost(double distance);

	public abstract double calculateFuelEfficiency(double distance, double fuelPrice);

	public abstract void startEngine();

	// Getters and Setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public long getModelYear() {
		return modelYear;
	}

	public void setModelYear(long modelYear) {
		this.modelYear = modelYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public VehicleColor getColor() {
		return color;
	}

	public void setColor(VehicleColor color) {
		this.color = color;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public double getGasTankCapacity() {
		return gasTankCapacity;
	}

	public void setGasTankCapacity(double gasTankCapacity) {
		this.gasTankCapacity = gasTankCapacity;
	}

	public StartMechanism getStartType() {
		return startType;
	}

	public void setStartType(StartMechanism startType) {
		this.startType = startType;
	}

	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", make=" + make + ", modelYear=" + modelYear + ", price="
				+ currencyFormat.format(price) + ", color=" + color + ", fuelType=" + fuelType + ", mileage=" + mileage + ", mass=" + mass
				+ ", cylinders=" + cylinders + ", gasTankCapacity=" + gasTankCapacity + ", startType=" + startType
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Vehicle v = (Vehicle)obj;
		
		boolean result =  brand.equals(v.getBrand()) &&
							make.equals(v.getMake()) &&
							modelYear == v.getModelYear() &&
							price == v.getPrice() &&
							color.equals(v.getColor()) &&
							fuelType.equals(v.getFuelType()) &&
							mileage == v.getMileage() &&
							mass == v.getMass() &&
							cylinders == v.getCylinders() &&
							gasTankCapacity == v.getGasTankCapacity() &&
							startType.equals(v.getStartType()) &&
							getClass() == v.getClass();
		
		return result;
	}
	
}
