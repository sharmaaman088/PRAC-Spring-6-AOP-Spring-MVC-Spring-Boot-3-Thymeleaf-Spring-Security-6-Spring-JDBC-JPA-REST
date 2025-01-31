package com.example.beans;

//DONE
public class Person {


    public Person() {
        System.out.println("Person bean created by Spring");
    }

    private String name ;
    private Vehicle vehicle;
    private  Glasses glasses;

    public Glasses getGlasses() {
        return glasses;
    }

    public void setGlasses(Glasses glasses) {
        this.glasses  = glasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
