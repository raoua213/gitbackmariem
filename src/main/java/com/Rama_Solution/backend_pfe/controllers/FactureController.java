package com.Rama_Solution.backend_pfe.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Facture;
import com.Rama_Solution.backend_pfe.serviceImpl.FactureServiceImpl;
import com.fasterxml.jackson.annotation.JsonFormat;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FactureController {
	@Autowired
	private FactureServiceImpl factureServiceImpl;
	
	@PostMapping("/addFacture")
	public Facture addFacture(@RequestBody Facture f) {
		return factureServiceImpl.addFacture(f);
	}
	
	@DeleteMapping("/deleteFactureById")
	public void deleteFactureById(@RequestParam Long id) {
		factureServiceImpl.deleteFactureById(id);
	}
	
	@GetMapping("/findAllFactures")
	public List<Facture> findAllFactures() {
		return factureServiceImpl.findAllFactures();
	}
	
	@GetMapping("/findFactureById")
	public Facture findFactureById(@RequestParam Long id) {
		return factureServiceImpl.findFactureById(id);
	}
	@GetMapping("/findFactureByIdEleve/{IDEleve}")
	public List<Facture> findFactureByIdEleve(@PathVariable Long IDEleve) {
		return factureServiceImpl.findFactureByIdEleve(IDEleve);
	}
	@GetMapping("/findFactureByIdEleve_Date/{IDEleve}/{DateF}")
	public List<Facture> findFactureByIdEleve_Date(@PathVariable Long IDEleve,@PathVariable @JsonFormat(pattern="dd-MM-yyyy") Date DateF) {
		return factureServiceImpl.findFactureByIdEleve_Date(IDEleve, DateF);
	}
	@GetMapping("/findElevesPayed_Date/{DateF}")
	public List<Facture> findElevesPayed_Date(@PathVariable Date DateF) {
		return factureServiceImpl.findElevesPayed_Date(DateF);
	}
}
