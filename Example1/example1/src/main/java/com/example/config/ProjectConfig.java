package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehiclemethod() {
        Vehicle obj = new Vehicle();
        obj.setName("Audi 8");
        return obj;
    }
    @Bean
    String hello() {
        return "Hello World";
    }
    @Bean
    Integer number() {
        return 10;
    }
}
