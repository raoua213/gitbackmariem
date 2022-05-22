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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Facture;
import com.Rama_Solution.backend_pfe.serviceImpl.FactureServiceImpl;

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
	public List<Facture> findFactureByIdEleve_Date(@PathVariable Long IDEleve,@PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date DateF) {
		return factureServiceImpl.findFactureByIdEleve_Date(IDEleve, DateF);
	}
	@GetMapping("/findElevesPayed_Date/{DateF}")
	public List<Facture> findElevesPayed_Date(@PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date DateF) {
		return factureServiceImpl.findElevesPayed_Date(DateF);
	}
	
	//4alta hedhi
	@GetMapping("/AllPaiement/{montant}")
	public String AllPaiement(@RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy") Date dateE, @PathVariable double montant) {
		//List<Facture> lis = factureServiceImpl.findElevesPayed_Date(dateE);
		
		return "le montant totale pour le mois "+ dateE + " est : " + factureServiceImpl.AllPaiement(dateE, montant);
	}
	
	@GetMapping("AllPaiement_Date/{DateF}")
	public double AllPaiement_Date(@PathVariable Date dateF) {
		return factureServiceImpl.AllPaiement_Date(dateF);
	}

}
