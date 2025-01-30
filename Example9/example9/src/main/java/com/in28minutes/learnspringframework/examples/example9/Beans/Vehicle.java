package com.in28minutes.learnspringframework.examples.example9.Beans;

public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle created by Spring");
    }

    private String name;
    public String getName() {
    return name;
}
    public void setName(String name) {
    this.name = name;
}


    public void printHello()
    {
    System.out.println("Printing hello from vehicle component bean");
    }



    @Override
    public String toString() {
    return "Vehicle{" +
            "name='" + name + '\'' +
            '}';
}
}