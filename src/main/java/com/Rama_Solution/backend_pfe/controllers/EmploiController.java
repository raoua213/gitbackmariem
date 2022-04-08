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

import com.Rama_Solution.backend_pfe.entities.Emploi;
import com.Rama_Solution.backend_pfe.service.EmploiServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmploiController {
	@Autowired
	private EmploiServiceImpl emploiServiceImpl;

	@PostMapping("/addEmploi")
	public Emploi addEmploi(@RequestBody Emploi em) {
		return emploiServiceImpl.addEmploi(em);
	}
	
	@GetMapping("/findAllEmplois")
	public List<Emploi> findAllEmplois() {
		return emploiServiceImpl.findAllEmplois();
	}
	
	@GetMapping("/findEmploiById")
	public Emploi findEmploiById(Long id) {
		return emploiServiceImpl.findEmploiById(id);
	}
	
	@DeleteMapping("/deleteEmploiById")
	public String deleteEmploiById(@RequestParam Long id) {
		emploiServiceImpl.deleteEmploiById(id);
		return "Emploi deleted!";
		
	}
	
	@PutMapping("/updateEmploi")
	public Emploi updateEmploi(@RequestBody Emploi em) {
		return emploiServiceImpl.updateEmploi(em);
	}
}
