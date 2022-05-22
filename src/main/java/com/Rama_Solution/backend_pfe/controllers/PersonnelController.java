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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Personnel;
import com.Rama_Solution.backend_pfe.serviceImpl.PersonnelServiceImpl;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
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
	
	@GetMapping("/getPersonnelById/{id}")
	public Personnel findPersonnelById (@PathVariable Long id){
		return personnelServiceImpl.findPersonnel(id) ;
		
	}	
	
	@GetMapping("/findPersonnelsByFonction/{fonction}")
	public List<Personnel> findPersonnelsByFonction(@PathVariable String fonction) {
		return personnelServiceImpl.findPersonnelsByFonction(fonction);
	}
	
	@PutMapping("/updatePersonnel")
	public Personnel updatePersonnel(@RequestBody Personnel p) {
		return personnelServiceImpl.updatePersonnel(p);
	}
	
	@PutMapping("/updateCongesTaken")
	public int updateCongesTaken(@RequestParam int nb_jour, @RequestParam Long IdPersonnel) {
		personnelServiceImpl.updateCongesTaken(nb_jour, IdPersonnel);
		return nb_jour;
	}
	
	@DeleteMapping("/deletePersonnelById")
	public String deletePersonnelById(@RequestParam Long id) {
		personnelServiceImpl.deletePersonnelById(id);
		return "Personnel Deleted!";
	}
	
	@GetMapping("/findByCIN/{cin}")
	public Personnel findByCIN(@PathVariable String cin) {
		return personnelServiceImpl.findByCIN(cin);
	}

	@GetMapping("/findSalaireByIdPersonnel_Date/{idPersonnel}/{dateDebut}/{dateFin}/{montant}")
	public double findSalaireByIdPersonnel_Date(@PathVariable Long idPersonnel, @PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date dateDebut, @PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date dateFin, @PathVariable double montant) {
		return personnelServiceImpl.findSalaireByIdPersonnel_Date(idPersonnel, dateDebut, dateFin, montant);
	}
	
}
