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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Fiche_de_paie;
import com.Rama_Solution.backend_pfe.serviceImpl.FicheServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FicheController {
	@Autowired
	private FicheServiceImpl ficheServiceImpl;
	
	@PostMapping("/addFiche")
	public Fiche_de_paie addFiche(@RequestParam Fiche_de_paie fiche) {
		return ficheServiceImpl.addFiche(fiche);
	}
	
	@GetMapping("/findFicheById/{id}")
	public Fiche_de_paie findFicheById(@PathVariable Long id) {
		return ficheServiceImpl.findFicheById(id);
	}
	
	@GetMapping("/findAllFiche")
	public List<Fiche_de_paie> findAllFiche() {
		return ficheServiceImpl.findAllFiche();
	}
	
	@DeleteMapping("/deleteFicheById/{id}")
	public void deleteFicheById(@PathVariable Long id) {
		ficheServiceImpl.deleteFicheById(id);
	}
	
	@GetMapping("/findFicheByIdPersonnel/{IDP}")
	private List <Fiche_de_paie> findFicheByIdPersonnel(@PathVariable Long IDP) {
		return ficheServiceImpl.findFicheByIdPersonnel(IDP);
	}
	
	@GetMapping("findFicheByIdPersonnel_Date/{IDP}/{dateF}")
	private List <Fiche_de_paie> findFicheByIdPersonnel_Date(@PathVariable Long IDP,@PathVariable @DateTimeFormat(pattern = "dd-mm-yyyy") Date dateF) {
		return ficheServiceImpl.findFicheByIdPersonnel_Date(IDP, dateF);
	}
	
	@GetMapping("/findAllSalaires_Date/{DateDebut}/{DateFin}")
	public double findAllSalaires_Date(@PathVariable @DateTimeFormat(pattern = "dd-mm-yyyy") Date DateDebut, @PathVariable @DateTimeFormat(pattern = "dd-mm-yyyy") Date DateFin) {
		return ficheServiceImpl.findAllSalaires_Date(DateDebut, DateFin);
	}
}
