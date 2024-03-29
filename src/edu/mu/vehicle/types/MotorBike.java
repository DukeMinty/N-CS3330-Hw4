package edu.mu.vehicle.types;

import edu.mu.vehicle.FuelType;
import edu.mu.vehicle.StartMechanism;
import edu.mu.vehicle.Vehicle;
import edu.mu.vehicle.VehicleColor;

public class MotorBike extends Vehicle{

	public MotorBike(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		//readFromFile should make sure these are MotorBike and Kickstart
		//but this is an extra measure since they're mandatory traits
		setStartType(StartMechanism.KICKSTART);
	}

	@Override
	public double calculateMaintenanceCost(double distance) {
		double maintenaceCost = distance * getMass() * (2024-getModelYear()) * getCylinders() * 0.0002;
		return maintenaceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency = getCylinders() * getGasTankCapacity() * fuelPrice / distance * 0.001;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		try {
			System.out.println("Kick Starting...");
            		Thread.sleep(1000);
            		System.out.println("VRRRRRRR");
	        	Thred.sleep(1000);;
	        	System.out.println("Started!");
        	} catch (InterruptedException e) {
            		e.printStackTrace();
        	}
		
	}

}
