package com.fisioapp.calendar.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Patient {

	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private LocalDate birthDate;
	
	/**
	 * Estado civil
	 */
	private String maritalStatus;
	
	private String 	occupation;
	
	/**
	 * Motivo de consulta
	 */
	private String appointmentMotive;
	
	/**
	 * Pruebas médicas con las que cuenta
	 */
	private String medicalTests;
	
	/**
	 * Bandera que indica si practica deporte
	 */
	private boolean sport;
	
	/**
	 * Deportes practicados
	 */
	private String sports;
	
	/**
	 * Bandera que indica si padece diabetes
	 */
	private boolean diabetes;
	
	/**
	 * Bandera que indica si padece hipertension
	 */
	private boolean hypertension;
	
	/**
	 * Otros padecimientos
	 */
	private String otherConditions;
	
	private LocalDate creationDate;
	
	private LocalDate lastUpdate;
	
	private Locator locator;
	
	private Address address;
	
	private User createdBy;
	
	private User updatedBy;
	
}
