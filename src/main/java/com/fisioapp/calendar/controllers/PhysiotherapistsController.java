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

import com.fisioapp.calendar.models.Physiotherapist;
import com.fisioapp.calendar.services.PhysiotherapistsService;

@RestController
@RequestMapping("/physiotherapists")
public class PhysiotherapistsController {

    @Autowired
    private PhysiotherapistsService physiotherapistService;

    @PostMapping
    public void addPhysiotherapist(@RequestBody Physiotherapist physiotherapist) {
        physiotherapistService.create(physiotherapist);
    }

    @PostMapping("/{id}")
    public void updatePhysiotherapist(@PathVariable long id, @RequestBody Physiotherapist physiotherapist) {
        physiotherapistService.update(physiotherapist);
    }

    @DeleteMapping("/{id}")
    public void deletePhysiotherapist(@PathVariable long id) {
        physiotherapistService.delete(id);
    }

    @GetMapping
    public List<Physiotherapist> getPhysiotherapists() {
        return physiotherapistService.list();
    }
}