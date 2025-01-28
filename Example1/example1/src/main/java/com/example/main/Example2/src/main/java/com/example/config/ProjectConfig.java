package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehiclemethod1()
    {
        Vehicle obj = new Vehicle();
        obj.setName("Audi 8");
        return obj;
    }
    @Bean
        Vehicle vehiclemethod2 ()
    {
            Vehicle obj2= new Vehicle();
            obj2.setName("Honda");
            return obj2;
    }
        @Bean
        Vehicle vehiclemethod3 () {
                Vehicle obj3 = new Vehicle();
                obj3.setName("Ferrari");
                return obj3;

            }
        }

