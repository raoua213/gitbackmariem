package com.Rama_Solution.backend_pfe.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Eleve;
import com.Rama_Solution.backend_pfe.service.EleveServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EleveController {
	@Autowired
	private EleveServiceImpl eleveServiceImpl;

	@PostMapping("/addEleve")
	public String addEleve(@RequestBody Eleve e) 
	{
		List<Eleve> listE = new ArrayList<Eleve>();
		listE = findAllEleve();
		for (int i = 0; i < listE.size(); i++) {
			Eleve el = listE.get(i);
			if (el.equals(e)) {
				return "Eleve existe! ";
			}
			if( i==listE.size())
				eleveServiceImpl.addEleve(e);
		}
		
		return "Eleve ajouter!";
	}

	@GetMapping("/getAllEleves")
	public List<Eleve> findAllEleve() {
		return eleveServiceImpl.findAllEleves();

	}

	@GetMapping("/getEleveById")
	public Eleve findEleveById(@RequestParam Long id) {
		return eleveServiceImpl.findEleve(id);

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

	@GetMapping("/findEleveByIdClasse/{IDCL}")
	public List<Eleve> findEleveByIdClasse(@PathVariable Long IDCL) {
		return eleveServiceImpl.findEleveByIdClasse(IDCL);
	}

}
