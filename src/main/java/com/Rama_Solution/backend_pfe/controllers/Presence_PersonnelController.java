package com.Rama_Solution.backend_pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Presence_personnel;
import com.Rama_Solution.backend_pfe.service.Presence_personnelServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class Presence_PersonnelController {
	@Autowired
	private Presence_personnelServiceImpl presence_personnelServiceImpl;
	
	@PostMapping("/addPresence_personnel")
	public Presence_personnel addPresence_personnel(Presence_personnel pp) {
		 presence_personnelServiceImpl.addPresence_personnel(pp);
		 return pp;	
	}
	
	@GetMapping("/findByDatePP")
	public Presence_personnel findByDate(Presence_personnel pp) {
		return presence_personnelServiceImpl.findByDate(pp);
	}

	@GetMapping("/findAllPP")
	public 	List<Presence_personnel> findAllPresence_personnels() {
		return presence_personnelServiceImpl.findAllPresence_personnels();
	}

}
