package com.fisioapp.calendar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisioapp.calendar.mappers.AddressMapper;
import com.fisioapp.calendar.mappers.LocatorsMapper;
import com.fisioapp.calendar.mappers.PatientsMapper;
import com.fisioapp.calendar.models.Patient;

@Service
public class PatientsService {
	
	@Autowired
    private PatientsMapper patientsMapper;
	
	@Autowired
	private LocatorsMapper locatorsMapper;
	
	@Autowired
	private AddressMapper addressMapper;
	
	public Patient get(long id) {
        return patientsMapper.get(id);
    }
    
    public void create(Patient patient) {
    	
    	locatorsMapper.create(patient.getLocator());
    	addressMapper.create(patient.getAddress());
    	patientsMapper.create(patient);
    }

    public void update(Patient patient) {
    	locatorsMapper.update(patient.getLocator());
    	addressMapper.update(patient.getAddress());
    	patientsMapper.update(patient);
    }

    public void delete(long id) {
    	patientsMapper.delete(id);
    }

    public List<Patient> list() {
        return patientsMapper.list();
    }
}
