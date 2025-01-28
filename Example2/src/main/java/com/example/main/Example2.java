package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle obj = context.getBean("vehiclemethod3" ,Vehicle.class);
        System.out.println("Vehicle Name from Spring is: " + obj.getName());
    }
}
