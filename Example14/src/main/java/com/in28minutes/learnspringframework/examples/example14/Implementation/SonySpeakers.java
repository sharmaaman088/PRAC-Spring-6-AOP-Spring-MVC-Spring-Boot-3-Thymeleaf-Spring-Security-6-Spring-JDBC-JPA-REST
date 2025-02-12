package com.in28minutes.learnspringframework.examples.example14.Implementation;

 
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.examples.example14.interfaces.Speakers;

@Component
public class SonySpeakers implements Speakers {

	@Override
	public String makesound() {
		// TODO Auto-generated method stub
		return "Music is playing with SonySpeakers ";
	}

}
