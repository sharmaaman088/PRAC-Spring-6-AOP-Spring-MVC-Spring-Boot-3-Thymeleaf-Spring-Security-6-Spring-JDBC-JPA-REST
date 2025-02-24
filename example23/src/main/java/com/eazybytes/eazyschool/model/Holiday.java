package com.eazybytes.eazyschool.model;

import lombok.Data;

@Data
public class Holiday {
	
	private final String day;
	public String getDay() {
		return day;
	}

	public String getReason() {
		return reason;
	}

	public Type getType() {
		return type;
	}

	private final String reason;
	public Holiday(String day, String reason, Type type) {
		super();
		this.day = day;
		this.reason = reason;
		this.type = type;
	}

	private final Type type;
	
	public enum Type {
	    FESTIVAL, FEDERAL
	}

	
	
	
	
	

}
