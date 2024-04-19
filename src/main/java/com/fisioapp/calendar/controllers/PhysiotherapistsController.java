package com.fisioapp.calendar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fisioapp.calendar.models.Physiotherapist;
import com.fisioapp.calendar.services.PhysiotherapistsService;

@Controller
@RequestMapping("/physios")
public class PhysiotherapistsController {

    @Autowired
    private PhysiotherapistsService physiotherapistService;

    @GetMapping("/add")
    public String addPhysiotherapist(Model model) {
        model.addAttribute("physiotherapist", new Physiotherapist());
        model.addAttribute("title", "Nuevo Alumno");
        return "/views/physios/add";
    }

    @PostMapping("/create")
    public String createPhysiotherapist(@ModelAttribute Physiotherapist physiotherapist, BindingResult result) {
        if (result.hasErrors()) {
            return "physios/create";
        }

        physiotherapistService.create(physiotherapist);
        return "redirect:/physios/";
    }

    @PostMapping("/{id}")
    public String updatePhysiotherapist(@PathVariable long id, Model model) {
        Physiotherapist physiotherapist = physiotherapistService.get(id);
        model.addAttribute("physiotherapist", physiotherapist);

        // trabajo en progreso..

        return "physios/update";
    }

    @DeleteMapping("/{id}")
    public void deletePhysiotherapist(@PathVariable long id) {
        physiotherapistService.delete(id);
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Physiotherapist> physiotherapists = physiotherapistService.list();
        model.addAttribute("physiotherapists", physiotherapists);
        return "/views/physios/list";
    }
}