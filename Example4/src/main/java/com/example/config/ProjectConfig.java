package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean(value = "Audi 8")
    Vehicle vehiclemethod1() {
        Vehicle obj = new Vehicle();
        obj.setName("Audi 8");
        return obj;
    }

    @Bean(value = "Honda")
    Vehicle vehiclemethod2() {
        Vehicle obj2 = new Vehicle();
        obj2.setName("Honda");
        return obj2;
    }
@Primary
    @Bean(value = "Ferrari")
    Vehicle vehiclemethod3() {
        Vehicle obj3 = new Vehicle();
        obj3.setName("Ferrari");
        return obj3;

    }
}

