package com.fisioapp.calendar.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;

@Data
public class Patient {

	private long id;
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@NotEmpty
	private String gender;
	
	@Past
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
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
