package com.fisioapp.calendar.controllers;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fisioapp.calendar.models.Patient;
import com.fisioapp.calendar.services.PatientsService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/patients")
public class PatientsController {
	
	@Autowired
	private PatientsService patientsService;
	
	List<Patient> patients;
	
	@GetMapping("/add")
    public String addPhysiotherapist(Model model) {
        model.addAttribute("patient", new Patient());
        model.addAttribute("title", "Nuevo Paciente");
        return "views/patients/add";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Patient patient, BindingResult result,
    		Model model, RedirectAttributes attribute) {
    	if (result.hasErrors()) {
			model.addAttribute("titulo", "Nuevo Paciente");
			model.addAttribute("patient", patient);		
			return "views/patients/add";
		}

        if(patient.getId() != 0){
        	patientsService.update(patient);
        }
        else{
        	patientsService.create(patient);
        }
        attribute.addFlashAttribute("success", "Paciente guardado con exito!");
        return "redirect:/patients/";
    }

    @GetMapping("/update/{id}")
    public String updatePhysiotherapist(@PathVariable("id") Long id, Model model) {

        if(id != null) {
            Optional<Patient> patient = Optional.ofNullable(patientsService.get(id));
            if(patient.isPresent()) {
                model.addAttribute("physiotherapist", patient.get());
            }
        }
        else{
            return "redirect:/patients/";
        }
        
        return "views/patients/add";
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable long id) {
    	patientsService.delete(id);
    }

	
	@GetMapping("/")
	public String list(Model model) {
		patients = patientsService.list();
		model.addAttribute("titulo", "Listado de Pacientes");
		model.addAttribute("patients", patients);
		
		return "views/patients/list";
	}
	
	

}
