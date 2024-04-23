package com.fisioapp.calendar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisioapp.calendar.mappers.PatientsMapper;
import com.fisioapp.calendar.models.Patient;

@Service
public class PatientService {

	 @Autowired
	    private PatientsMapper patientsMapper;
	    
	    public void create(Patient patient) {
	    	patientsMapper.create(patient);
	    }

	    public void update(Patient patient) {
	    	patientsMapper.update(patient);
	    }

	    public void delete(long id) {
	    	patientsMapper.delete(id);
	    }

	    public List<Patient> list() {
	        return patientsMapper.list();
	    }
}
