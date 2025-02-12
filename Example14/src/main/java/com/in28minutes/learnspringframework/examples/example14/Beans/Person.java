package com.in28minutes.learnspringframework.examples.example14.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component (value = "personbean")
public class Person {

  
    private String name ="Aman";
    private final Vehicle vehicle;
    
    
    @Autowired
    public Person(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	
    

 

   







}