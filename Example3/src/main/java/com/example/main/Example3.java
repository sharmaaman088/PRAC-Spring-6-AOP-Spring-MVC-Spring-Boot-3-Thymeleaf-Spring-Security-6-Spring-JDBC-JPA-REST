package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Vehicle obj2 = context.getBean("Audi 8" ,Vehicle.class);
        System.out.println("Vehicle Name from Spring is: " + obj2.getName());

       Vehicle obj = context.getBean("Honda" ,Vehicle.class);
        System.out.println("Vehicle Name from Spring is: " + obj.getName());

        Vehicle obj3 = context.getBean("Ferrari", Vehicle.class);
        System.out.println("Vehicle Name from Spring is: " + obj3.getName());
    }
}
