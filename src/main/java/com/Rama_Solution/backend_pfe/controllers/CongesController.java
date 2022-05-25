package com.Rama_Solution.backend_pfe.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Conges;
import com.Rama_Solution.backend_pfe.serviceImpl.CongesServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CongesController {
	
	@Autowired
	CongesServiceImpl congesServiceImpl;

	/*@SuppressWarnings("deprecation")
	@PostMapping("/addConges")
	public Conges addConges(@RequestBody Date From, Date To) {
		int i=From.getDay();
		int j=To.getDay();
		for(int n=i;n<j+1;n++) {
			return congesServiceImpl.addConges(From.);	
		}
			
		
	}*/
	
	@GetMapping("/findAllConges")
	public List<Conges> findAllConges() {
		return congesServiceImpl.findAllConges();
	}
	
	@GetMapping("/findCongesById/{id}")
	public Conges findCongesById(@PathVariable Long id) {
		return congesServiceImpl.findCongesById(id);
	}
	
	
	@GetMapping("/findDispoPersonnelByConges/{IdPersonnel}/{DateC}")
	public String findDispoPersonnelByConges(@PathVariable Long IdPersonnel, @PathVariable  @DateTimeFormat(pattern = "dd-mm-yyyy") Date DateC) {
		List<Conges> lis = new ArrayList<Conges>();
		lis= congesServiceImpl.findDispoPersonnelByConges(IdPersonnel, DateC);
		if (lis.size()>0) {
			return "Personnel non disponible ";
		}
		else {
			return "Personnel disponible";
		}
		
	}
	
	@GetMapping("/findCongesByIdPersonnel/{IdPersonnel}")
	public List<Conges> findCongesByIdPersonnel(@PathVariable Long IdPersonnel) {
		return congesServiceImpl.findCongesByIdPersonnel(IdPersonnel);
	}


}
