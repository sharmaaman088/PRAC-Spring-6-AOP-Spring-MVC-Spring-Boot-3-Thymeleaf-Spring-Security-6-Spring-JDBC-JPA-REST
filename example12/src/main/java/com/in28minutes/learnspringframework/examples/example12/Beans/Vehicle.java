package com.in28minutes.learnspringframework.examples.example12	.Beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
	
	private String name;
	
	private Person person;

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