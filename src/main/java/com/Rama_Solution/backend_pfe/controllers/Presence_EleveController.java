package com.Rama_Solution.backend_pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Presence_eleve;
import com.Rama_Solution.backend_pfe.service.Presence_eleveServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class Presence_EleveController {
	@Autowired
	private Presence_eleveServiceImpl presence_eleveServiceImpl;
	
	@PostMapping("/addPresence_eleve")
	public 	Presence_eleve addPresence_eleve(@RequestBody Presence_eleve pe) {
		presence_eleveServiceImpl.addPresence_eleve(pe);
		return pe;
	}

	@GetMapping("/findByDatePE")
	public Presence_eleve findByDate(Presence_eleve pe) {
		return presence_eleveServiceImpl.findByDate(pe);
	}

	@GetMapping("/findAllPresentPE")
	public Presence_eleve findAllPresent(Presence_eleve pe) {
		return presence_eleveServiceImpl.findAllPresent(pe);
	}
	
	@GetMapping("/findAllAbsentPE")
	public Presence_eleve findAllAbsent(Presence_eleve pe) {
		return presence_eleveServiceImpl.findAllAbsent(pe);
	}

	@GetMapping("/findAllPE")
	public List<Presence_eleve> findAllPresence_eleves() {
		return presence_eleveServiceImpl.findAllPresence_eleves();
	}

}
