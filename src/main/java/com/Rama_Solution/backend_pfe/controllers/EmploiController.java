package com.Rama_Solution.backend_pfe.controllers;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Emploi;
import com.Rama_Solution.backend_pfe.serviceImpl.EmploiServiceImpl;

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
	
	@GetMapping("/findEmploiById/{id}")
	public Emploi findEmploiById(@PathVariable Long id) {
		return emploiServiceImpl.findEmploiById(id);
	}
	
	@GetMapping("/findDispoPersonnel/{IdPersonnel}/{DateE}")
	public String findDispoPersonnel(@PathVariable Long IdPersonnel, @PathVariable  @DateTimeFormat(pattern = "dd-mm-yyyy") Date DateE) {
		List<Emploi> lis = new ArrayList<Emploi>();
			lis= emploiServiceImpl.findDispoPersonnel(IdPersonnel, DateE);
			if (lis.size()>0) {
				return "Personnel non disponible ";
			}
			else {
				return "Personnel disponible";
			}
	}

	
	@DeleteMapping("/deleteEmploiById/{id}")
	public String deleteEmploiById(@PathVariable Long id) {
		emploiServiceImpl.deleteEmploiById(id);
		return "Emploi deleted!";
		
	}
	
	@PutMapping("/updateEmploi")
	public Emploi updateEmploi(@RequestBody Emploi em) {
		return emploiServiceImpl.updateEmploi(em);
	}
}
