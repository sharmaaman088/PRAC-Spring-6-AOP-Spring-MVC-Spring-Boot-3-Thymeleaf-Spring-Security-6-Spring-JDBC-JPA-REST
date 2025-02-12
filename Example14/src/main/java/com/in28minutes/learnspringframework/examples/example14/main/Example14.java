package com.in28minutes.learnspringframework.examples.example14.main;

import com.in28minutes.learnspringframework.examples.example14.Beans.Person;
import com.in28minutes.learnspringframework.examples.example14.Beans.Vehicle;
import com.in28minutes.learnspringframework.examples.example14.Services.VehicleServices;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.learnspringframework.examples.example14.config.ProjectConfig;

//@ComponentScan("com.in28minutes.learnspringframework.examples.example14.Beans")

public class Example14 {

    public static void main(String[] args)
    {

    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    VehicleServices obj =context.getBean(VehicleServices.class);
    System.out.println("Hashcode of first object we called" +obj.hashCode());
    VehicleServices obj2 =context.getBean(VehicleServices.class);
    System.out.println("Hashcode of first object we called" +obj2.hashCode());
    VehicleServices obj3 =context.getBean(VehicleServices.class);
    System.out.println("Hashcode of first object we called" +obj3.hashCode());
    
     
}
}