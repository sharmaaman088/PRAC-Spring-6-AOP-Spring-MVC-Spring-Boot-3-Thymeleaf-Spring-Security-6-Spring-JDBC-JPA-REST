package com.in28minutes.learnspringframework.examples.example9.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component(value = "personBean")
@Lazy
public class Person {

    

    private String name ="Aman";
    private final Vehicle vehicle;
    
    
@Autowired
    public Person(Vehicle vehicle) {
		 System.out.println("Person bean created by Spring");
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