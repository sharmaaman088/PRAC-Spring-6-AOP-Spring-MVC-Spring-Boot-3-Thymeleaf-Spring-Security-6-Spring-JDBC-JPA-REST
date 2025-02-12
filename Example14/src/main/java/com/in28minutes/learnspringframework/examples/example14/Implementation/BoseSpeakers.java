package com.in28minutes.learnspringframework.examples.example14.Implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.examples.example14.interfaces.Speakers;

@Primary
@Component
public class BoseSpeakers implements Speakers{

	@Override
	public String makesound() {
		// TODO Auto-generated method stub
		return "Music is playing with BoseSpeakers";
	}

}
