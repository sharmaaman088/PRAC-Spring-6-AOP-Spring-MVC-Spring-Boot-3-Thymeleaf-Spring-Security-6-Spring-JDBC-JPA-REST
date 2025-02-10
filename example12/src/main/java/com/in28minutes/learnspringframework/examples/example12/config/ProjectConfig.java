package com.in28minutes.learnspringframework.examples.example12.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.in28minutes.learnspringframework.examples.example12.Beans.Vehicle;
 
 
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan(basePackages = "com.in28minutes.learnspringframework.examples.example12.Beans")

public class ProjectConfig {
 
   @Bean
	Vehicle vehicle() {
		Vehicle veh = new Vehicle();
		veh.setName("Audi");
		return veh;
	}
   @Primary
   @Bean
  	Vehicle vehicle2() {
  		Vehicle veh = new Vehicle();
  		veh.setName("Honda");
		return veh;
  	}
   
 
   @Bean
 	Vehicle vehicle3() {
 		Vehicle veh = new Vehicle();
 		veh.setName("Ferrari");
		return veh;
 	}

}


//@Qualifier("vehicle3")