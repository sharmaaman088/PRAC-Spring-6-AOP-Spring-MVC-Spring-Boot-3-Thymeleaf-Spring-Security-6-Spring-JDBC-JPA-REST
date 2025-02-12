package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;
@Component
public class SonySpeakers  implements Speakers {

    public String makeSound() {
        return "Playing with Sony!";
    }
}
