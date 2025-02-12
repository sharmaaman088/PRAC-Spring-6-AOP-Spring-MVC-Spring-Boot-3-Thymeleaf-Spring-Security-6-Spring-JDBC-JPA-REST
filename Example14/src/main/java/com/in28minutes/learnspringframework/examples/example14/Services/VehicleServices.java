package com.in28minutes.learnspringframework.examples.example14.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.examples.example14.interfaces.Speakers;
import com.in28minutes.learnspringframework.examples.example14.interfaces.Tyres;

@Component
public class VehicleServices {
	
	private VehicleServices vehicleservices;
	
	@Autowired
private Speakers speakers;
private Tyres tyres;	

	

	public VehicleServices getVehicleservices() {
		return vehicleservices;
	}

	public void setVehicleservices(VehicleServices vehicleservices) {
		this.vehicleservices = vehicleservices;
	}

	public void playmusic()
	{
		String music = speakers.makesound();
		System.out.println(music);
	}
	
	public void moveVehicle()
	{
		String status = tyres.rotate();
	    System.out.println(status);
	}

	public Speakers getSpeakers() {
		return speakers;
	}

	public void setSpeakers(Speakers speakers) {
		this.speakers = speakers;
	}

	public Tyres getTyres() {
		return tyres;
	}
@Autowired
	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}


}
