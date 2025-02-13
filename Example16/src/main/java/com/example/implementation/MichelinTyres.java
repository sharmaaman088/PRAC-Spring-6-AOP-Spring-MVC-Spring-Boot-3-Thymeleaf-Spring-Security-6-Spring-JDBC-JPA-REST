package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class MichelinTyres implements Tyres {
    public String rotate(){
        return "Vehicle moving Using Michelin Tyres";
    }
}

