package com.example.main;

import com.example.Services.VehicleServices;
import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices obj = context.getBean(VehicleServices.class);
        VehicleServices obj2 = context.getBean(VehicleServices.class);
        System.out.println("HashCODE OF OBJECT 1 vehicle services is " + obj.hashCode());
        System.out.println("HashCODE OF OBJECT 2 vehicle services is " + obj2.hashCode());
        Vehicle objs= context.getBean(Vehicle.class);
        Vehicle objs2 = context.getBean(Vehicle.class);
        System.out.println("HashCODE OF OBJECT  vehicle services is " + objs.hashCode());
        System.out.println("HashCODE OF antoher OBJECT  vehicle services is " + objs2.hashCode());
        if (obj.equals(obj2)) {
            System.out.println("Singleton");
        }
        else
            System.out.println("Prototype ");
    }
}