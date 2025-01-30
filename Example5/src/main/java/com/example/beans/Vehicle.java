package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("No beans are needed Since component will take care of it");
    }

    public void printHello() {
        System.out.println("Hello from VehicleBean");
    }
}
