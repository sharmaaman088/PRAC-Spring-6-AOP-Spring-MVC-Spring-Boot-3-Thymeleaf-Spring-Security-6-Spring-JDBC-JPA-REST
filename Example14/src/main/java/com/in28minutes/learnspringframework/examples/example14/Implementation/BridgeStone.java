package com.in28minutes.learnspringframework.examples.example14.Implementation;

import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.examples.example14.interfaces.Tyres;


@Component
public class BridgeStone implements Tyres {

	@Override
	public String rotate() {
		 
		return "Vehicle is Moving with BridgeStone Tyres";
	}


}
