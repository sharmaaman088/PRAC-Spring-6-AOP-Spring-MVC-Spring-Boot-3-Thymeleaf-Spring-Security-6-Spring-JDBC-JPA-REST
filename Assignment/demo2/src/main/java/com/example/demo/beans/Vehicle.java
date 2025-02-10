package com.example.demo.beans;

public class Vehicle {

	private String name;
	private String VehicleService;

	public String getVehicleService() {
		return VehicleService;
	}

	public void setVehicleService(String vehicleService) {
		VehicleService = vehicleService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleService=" + VehicleService + "]";
	}

	
	
}
