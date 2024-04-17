package com.fisioapp.calendar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisioapp.calendar.models.Clinic;
import com.fisioapp.calendar.services.ClinicService;

@RestController
@RequestMapping("/clinics")
public class ClinicController {

    @Autowired
    private ClinicService clinicService;

    @PostMapping
    public void addClinic(@RequestBody Clinic clinic) {
        clinicService.create(clinic);
    }

    @PostMapping("/{id}")
    public void updateClinic(@PathVariable long id, @RequestBody Clinic clinic) {
        clinicService.update(clinic);
    }

    @DeleteMapping("/{id}")
    public void deleteClinic(@PathVariable long id) {
        clinicService.delete(id);
    }

    @GetMapping
    public List<Clinic> getClinics() {
        return clinicService.list();
    }
}