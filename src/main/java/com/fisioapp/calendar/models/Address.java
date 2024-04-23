package com.fisioapp.calendar.models;

import lombok.Data;

@Data
public class Address {

	private long id;
	
	private String street;
	
	private String number;
	
	private String county;
	
	private String city;
	
	private String state;
	
	private String zipCode;
	
}
