package com.in28minutes.learnspringframework.examples.example14.Implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.examples.example14.interfaces.Tyres;
@Primary
@Component
public class MichelinTyres implements Tyres {

	
	@Override
	public String rotate() {
		
		return "Vehicle is Moving with MichelinTyres";
	}

}
