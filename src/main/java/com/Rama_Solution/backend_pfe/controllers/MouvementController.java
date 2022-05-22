package com.Rama_Solution.backend_pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Mouvement;
import com.Rama_Solution.backend_pfe.serviceImpl.MouvementServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MouvementController {
	@Autowired
	private MouvementServiceImpl mouvementServiceImpl;
	
	@PostMapping("/addMouvement")
	public Mouvement addMouvement(@RequestBody Mouvement mv) {
		return mouvementServiceImpl.addMouvement(mv);
	}
	
	@GetMapping("/findAllMouvements")
	public List<Mouvement> findAllMouvements() {
		return mouvementServiceImpl.findAllMouvements();
	}
	
	@GetMapping("/findMouvementById/{id}")
	public Mouvement findMouvementById(@PathVariable Long id) {
		return mouvementServiceImpl.findMouvementById(id);
	}
	
	@GetMapping("/updateMouvement")
	public Mouvement updateMouvement(@RequestBody Mouvement mv) {
		return mouvementServiceImpl.updateMouvement(mv);
	}
	
	@DeleteMapping("/deleteMouvement/{id}")
	public void deleteMouvement(@PathVariable Long id) {
		mouvementServiceImpl.deleteMouvement(id);
	}
}
