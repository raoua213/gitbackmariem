package com.Rama_Solution.backend_pfe.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/findByDatePE/{datePE}")
	public List<Presence_eleve> findByDate(@DateTimeFormat(pattern = "yyyy-mm-dd") Date datePE) {
		return presence_eleveServiceImpl.findByDatePE(datePE);
	}

	@GetMapping("/findByEtat/{etat}")
	public List<Presence_eleve> findByEtat(@PathVariable Boolean etat) {
		return presence_eleveServiceImpl.findByEtat(etat);
	}

	@GetMapping("/findAllPE")
	public List<Presence_eleve> findAllPresence_eleves() {
		return presence_eleveServiceImpl.findAllPresence_eleves();
	}

}
