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

import com.Rama_Solution.backend_pfe.entities.Presence_personnel;
import com.Rama_Solution.backend_pfe.serviceImpl.Presence_personnelServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Presence_PersonnelController {
	@Autowired
	private Presence_personnelServiceImpl presence_personnelServiceImpl;
	
	@PostMapping("/addPresence_personnel")
	public Presence_personnel addPresence_personnel(@RequestBody Presence_personnel pp) {
		 presence_personnelServiceImpl.addPresence_personnel(pp);
		 return pp;	
	}
	
	@GetMapping("/findByDatePP/{datePP}")
	public List<Presence_personnel> findByDate(@PathVariable @DateTimeFormat(pattern = "yyyy-mm-dd") Date datePP) {
		return presence_personnelServiceImpl.findByDate(datePP);
	}
	
	@GetMapping("/findByEtatPP/{etat}")
	public List<Presence_personnel> findByEtat(@PathVariable Boolean etat) {
		return presence_personnelServiceImpl.findByEtat(etat);
	}

	@GetMapping("/findAllPP")
	public 	List<Presence_personnel> findAllPresence_personnels() {
		return presence_personnelServiceImpl.findAllPresence_personnels();
	}

	@DeleteMapping("/deletePresencePersonnelById")
	public void deletePresencePersonnelByID(@RequestParam Long id) {
		presence_personnelServiceImpl.deletePresencePersonnelByID(id);
	}
	
	@PutMapping("/updatePresence_personnel")
	public Presence_personnel updatePresence_personnel(@RequestBody Presence_personnel pp) {
		return presence_personnelServiceImpl.updatePresence_personnel(pp);
		
	}
}
