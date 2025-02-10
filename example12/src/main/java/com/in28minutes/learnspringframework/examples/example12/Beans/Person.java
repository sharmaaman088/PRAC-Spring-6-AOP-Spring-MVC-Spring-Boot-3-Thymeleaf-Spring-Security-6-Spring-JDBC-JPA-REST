package com.in28minutes.learnspringframework.examples.example12.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
private String name ="lucy";

private final Vehicle vehicle;

@Autowired
public Person( Vehicle vehicle) {
    System.out.println("Person bean created by Spring ");
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

