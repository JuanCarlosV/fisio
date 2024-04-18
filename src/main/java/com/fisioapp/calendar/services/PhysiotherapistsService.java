package com.fisioapp.calendar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisioapp.calendar.mappers.PhysiotherapistsMapper;
import com.fisioapp.calendar.models.Physiotherapist;

@Service
public class PhysiotherapistsService {

    @Autowired
    private PhysiotherapistsMapper physiotherapistMapper;
    
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