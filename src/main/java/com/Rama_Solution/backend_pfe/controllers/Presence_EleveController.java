package com.Rama_Solution.backend_pfe.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Presence_eleve;
import com.Rama_Solution.backend_pfe.serviceImpl.Presence_eleveServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Presence_EleveController {
	@Autowired
	private Presence_eleveServiceImpl presence_eleveServiceImpl;
	
	@PostMapping("/addPresence_eleve")
	public 	Presence_eleve addPresence_eleve(@RequestBody Presence_eleve pe) {
		presence_eleveServiceImpl.addPresence_eleve(pe);
		return pe;
	}

	@GetMapping("/findByDatePE/{datePE}")
	public List<Presence_eleve> findByDate(@PathVariable("datePE") @DateTimeFormat(pattern = "dd-mm-yyyy") Date datePE) {
		return presence_eleveServiceImpl.findByDatePE(datePE);
	}

	@GetMapping("/findBetween2Date/{datePEStart}/{datePEEnd}")
	public List<Presence_eleve> findBetween2Date(@PathVariable("datePEStart") @DateTimeFormat(pattern = "dd-mm-yyyy") Date datePEStart, @PathVariable("datePEEnd")  @DateTimeFormat(pattern = "dd-mm-yyyy") Date datePEEnd) {
		return presence_eleveServiceImpl.findBetween2Date(datePEStart, datePEEnd);
	}
	
	@GetMapping("/findByEtat/{etat}")
	public List<Presence_eleve> findByEtat(@PathVariable Boolean etat) {
		return presence_eleveServiceImpl.findByEtat(etat);
	}

	@GetMapping("/findByEtat&Classe/{etat}/{idClasse}")
	public List<Presence_eleve> findByEtat_Classe(@PathVariable Boolean etat, @PathVariable Long idClasse) {
		return presence_eleveServiceImpl.findByEtat_Classe(etat, idClasse);
	}
	
	@GetMapping("/findAllPE")
	public List<Presence_eleve> findAllPresence_eleves() {
		return presence_eleveServiceImpl.findAllPresence_eleves();
	}
	
	@DeleteMapping("/deletePresenceEleveById")
	public void deletePresenceEleveByID(@RequestParam Long id) {
		presence_eleveServiceImpl.deletePresenceEleveByID(id);
	}
	
	@PutMapping("/updatePresence_eleve")
	public Presence_eleve updatePresence_eleve(@RequestBody Presence_eleve pe) {
		return presence_eleveServiceImpl.updatePresence_eleve(pe);
		
	}
	
	@GetMapping("/findByDate_Etat_Classe/{datePE}/{etat}/{idClasse}")
	public List<Presence_eleve> findByDate_Etat_Classe(@PathVariable("datePE") @DateTimeFormat(pattern = "dd-mm-yyyy") Date datePE, @PathVariable Boolean etat, @PathVariable Long idClasse) {
		return presence_eleveServiceImpl.findByDate_Etat_Classe(datePE, etat, idClasse);
	}
	
	@GetMapping("/findAllPresencesByIdEleve")
	List<Presence_eleve> findAllPresencesByIdEleve(@RequestParam Long IdEleve) {
		return presence_eleveServiceImpl.findAllPresencesByIdEleve(IdEleve);
	}
	
	

}
