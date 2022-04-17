package com.Rama_Solution.backend_pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Classe;
import com.Rama_Solution.backend_pfe.serviceImpl.ClasseServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClasseController {
	@Autowired
	private ClasseServiceImpl classeServiceImpl;
	
	@PostMapping("/addClasse")
	public Classe addClasse(@RequestBody Classe c) {
		return classeServiceImpl.addClasse(c);
	}
	
	@PutMapping("/updateClasse")
	public Classe updateClasse(@RequestBody Classe c) {
		return classeServiceImpl.updateClasse(c);
		
	}
	
	@DeleteMapping("/deleteCalsseById/{id}")
	public String deleteCalsseByID(@PathVariable Long id) {
		classeServiceImpl.deleteCalsseByID(id);
		return "Classe Deleted!";
	}
	
	@GetMapping("/findAllClasses")
	public List<Classe> findAllClasses() {
		return classeServiceImpl.findAllClasses();
	}
	
	@GetMapping("/findClasseById/{id}")
	public 	Classe findClasseById(@PathVariable Long id) {
		return classeServiceImpl.findClasseById(id);
	}
	
	/*@GetMapping("/NbEleveByNomClasse")
	public List<Classe> countNbEleve() {
		return classeServiceImpl.countNbEleve();
	}*/


}
