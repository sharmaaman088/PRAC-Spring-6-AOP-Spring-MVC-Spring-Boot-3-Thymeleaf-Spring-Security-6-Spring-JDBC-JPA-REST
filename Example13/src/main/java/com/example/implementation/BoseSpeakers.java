package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(){
        return "Playing with Bose Speakers";
    }
}
