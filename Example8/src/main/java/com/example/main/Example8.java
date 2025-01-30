package com.example.main;

import com.example.beans.Vehicle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example8 {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle obj = context.getBean(Vehicle.class);
        System.out.println("Vehicle Name from Spring is: " + obj.getName());


    }
}
