package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Glasses {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Glasses{" +
                "name='" + name + '\'' +
                '}';
    }
}
