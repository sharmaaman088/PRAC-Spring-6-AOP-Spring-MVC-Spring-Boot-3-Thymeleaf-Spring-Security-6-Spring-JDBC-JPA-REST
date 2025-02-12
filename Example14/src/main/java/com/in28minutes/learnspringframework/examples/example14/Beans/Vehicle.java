package com.in28minutes.learnspringframework.examples.example14.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.examples.example14.Services.VehicleServices;

@Component ("VehicleBean")
public class Vehicle {

    private String name = "Toyota";
     private final VehicleServices vehicleservices;
    
    
    
    @Autowired
    public Vehicle(VehicleServices vehicleservices) {
		super();
		this.vehicleservices = vehicleservices;
	}
	public VehicleServices getVehicleservices() {
		return vehicleservices;
	}
	public String getName() {
    return name;
}
    public void setName(String name) {
    this.name = name;
}


    @Override
    public String toString() {
    return "Vehicle{" +
            "name='" + name + '\'' +
            '}';
}
}