package com.fisioapp.calendar.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

        if(physiotherapist.getId() != 0){
            physiotherapistService.update(physiotherapist);
        }
        else{
            physiotherapistService.create(physiotherapist);
        }
        return "redirect:/physios/";
    }

    @GetMapping("/update/{id}")
    public String updatePhysiotherapist(@PathVariable("id") Long id, Model model) {

        if(id != null) {
            Optional<Physiotherapist> physiotherapist = Optional.ofNullable(physiotherapistService.get(id));
            if(physiotherapist.isPresent()) {
                model.addAttribute("physiotherapist", physiotherapist.get());
            }
        }
        else{
            return "redirect:/physios/";
        }
        
        return "/views/physios/add";
    }

    @PostMapping("/delete/{id}")
    public String deletePhysiotherapist(@PathVariable("id") Long id) {
        physiotherapistService.delete(id);

        return "redirect:/physios/";
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Physiotherapist> physiotherapists = physiotherapistService.list();
        model.addAttribute("physiotherapists", physiotherapists);
        return "/views/physios/list";
    }
}