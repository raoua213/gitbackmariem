package com.Rama_Solution.backend_pfe.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Eleve;
import com.Rama_Solution.backend_pfe.service.EleveServiceImpl;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class EleveController {
	@Autowired
	private EleveServiceImpl eleveServiceImpl;
	
	@PostMapping("/addEleve")
	public Eleve addEleve(@RequestBody Eleve e) 
							   
	{
		System.out.println("Eleve ajoute avec succes!");
      	eleveServiceImpl.addEleve(e);		
		return e;
	}
	
	@GetMapping("/getAllEleves")
	public List<Eleve> findAllEleve (){
		return eleveServiceImpl.findAllEleves() ;
		
	}
	
	@GetMapping("/getEleve")
	public Eleve findEleveById (Long id){
		return eleveServiceImpl.findEleve(id) ;
		
	}	
	
	@PutMapping("/updateEleve")
	public Eleve updateEleve(@RequestBody Eleve e) {
		return eleveServiceImpl.updateEleve(e);
	}
	
	@DeleteMapping("/deleteEleveById")
	public String deleteEleveById(@RequestParam Long id) {
		eleveServiceImpl.deleteEleveById(id);
		return "Eleve Deleted!";
	}
	
	
}
