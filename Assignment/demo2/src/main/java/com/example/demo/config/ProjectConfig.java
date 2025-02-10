package com.example.demo.config;

import org.springframework.context.annotation.Bean;

import com.example.demo.beans.Person;
import com.example.demo.beans.Vehicle;

public class ProjectConfig {

	
	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("Aman");
		person.setVehicle(vehicle() );
			return person;
	}
	@Bean
	public Vehicle vehicle() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Ferrari");
		vehicle.setVehicleService(getVSname());
		return vehicle;
	}
	
}