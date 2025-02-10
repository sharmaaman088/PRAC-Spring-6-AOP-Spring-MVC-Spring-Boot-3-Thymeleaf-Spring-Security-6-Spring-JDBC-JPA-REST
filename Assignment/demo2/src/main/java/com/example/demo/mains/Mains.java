package com.example.demo.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.beans.Person;
import com.example.demo.beans.Vehicle;
import com.example.demo.config.ProjectConfig;

public class Mains {
	
	public static void main(String[] args) {
		
	
	
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
	 Person pers = context.getBean(Person.class); 
	 Vehicle veh = context.getBean(Vehicle.class);
	 System.out.println(pers.getName());
	 System.out.println(pers.getVehicle());
	 System.out.println("The vehicle used by Aman is " + pers.getVehicle());
}
	}