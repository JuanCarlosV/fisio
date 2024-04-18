package com.fisioapp.calendar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisioapp.calendar.mappers.ClinicsMapper;
import com.fisioapp.calendar.models.Clinic;

@Service
public class ClinicsService {

    @Autowired
    private ClinicsMapper clinicMapper;
    
    public void create(Clinic clinic) {
        clinicMapper.create(clinic);
    }

    public void update(Clinic clinic) {
        clinicMapper.update(clinic);
    }

    public void delete(long id) {
        clinicMapper.delete(id);
    }

    public List<Clinic> list() {
        return clinicMapper.list();
    }
}
