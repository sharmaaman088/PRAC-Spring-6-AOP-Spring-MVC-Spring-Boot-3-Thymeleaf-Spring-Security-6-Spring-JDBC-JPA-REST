package com.example.beans;

import com.example.Services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component ("vehicleBean")
public class Vehicle {
    private String name = "Honda";
    private final VehicleServices vehicleServices;


    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }


    @Override
    public String toString()
    {return "Vehicle name is "+ name;}

}



