package com.fisioapp.calendar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisioapp.calendar.mappers.PhysiotherapistMapper;
import com.fisioapp.calendar.models.Physiotherapist;

@Service
public class PhysiotherapistService {

    @Autowired
    private PhysiotherapistMapper physiotherapistMapper;
    
    public void create(Physiotherapist physiotherapist) {
        physiotherapistMapper.create(physiotherapist);
    }

    public void update(Physiotherapist physiotherapist) {
        physiotherapistMapper.update(physiotherapist);
    }

    public void delete(long id) {
        physiotherapistMapper.delete(id);
    }

    public List<Physiotherapist> list() {
        return physiotherapistMapper.list();
    }
}