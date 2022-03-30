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

import com.Rama_Solution.backend_pfe.entities.Personnel;
import com.Rama_Solution.backend_pfe.service.PersonnelServiceImpl;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class PersonnelController {
	
	@Autowired
	private PersonnelServiceImpl personnelServiceImpl;
	
	@PostMapping("/addPersonnel")
	public Personnel addPersonnel(@RequestBody Personnel p) 
							   
	{
		System.out.println("Personnel ajoute avec succes!");
		personnelServiceImpl.addPersonnel(p);		
		return p;
	}
	
	@GetMapping("/getAllPersonnels")
	public List<Personnel> findAllPersonnel (){
		return personnelServiceImpl.findAllPersonnels();
		
	}
	
	@GetMapping("/getPersonnelById")
	public Personnel findPersonnelById (Long id){
		return personnelServiceImpl.findPersonnel(id) ;
		
	}	
	
	@PutMapping("/updatePersonnel")
	public Personnel updatePersonnel(@RequestBody Personnel p) {
		return personnelServiceImpl.updatePersonnel(p);
	}
	
	@DeleteMapping("/deletePersonnelById")
	public String deletePersonnelById(@RequestParam Long id) {
		personnelServiceImpl.deletePersonnelById(id);
		return "Personnel Deleted!";
	}
}
