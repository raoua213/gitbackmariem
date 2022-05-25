
package com.Rama_Solution.backend_pfe.controllers;

import java.util.Date;
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

import com.Rama_Solution.backend_pfe.entities.Commande;
import com.Rama_Solution.backend_pfe.serviceImpl.CommandeServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommandeController {
	@Autowired
	private CommandeServiceImpl commandeServiceImpl;
	
	@PostMapping("/addCommande")
	public Commande addCommande(@RequestBody Commande cm) {
		return commandeServiceImpl.addCommande(cm);
	}
	
	@GetMapping("/findAllCommandes")
	public List<Commande> findAllCommandes() {
		return commandeServiceImpl.findAllCommandes();
	}
	
	@GetMapping("/findCommandeById")
	public Commande findCommandeById(@RequestParam Long id) {
		return commandeServiceImpl.findCommandeById(id);
	}
	
	@DeleteMapping("/deleteCommandeById")
	public void deleteCommandeById(@RequestParam Long id) {
		commandeServiceImpl.deleteCommandeById(id);
	}
	
	@PutMapping("/updateCommande")
	public Commande updateCommande(@RequestBody Commande cm) {
		return commandeServiceImpl.updateCommande(cm);
	}
	
	@GetMapping("/AllCommandeDuMois/{dateCDebut}/{dateCFin}")
	public double AllCommandeDuMois(@PathVariable Date dateCDebut, @PathVariable Date dateCFin) {
		return commandeServiceImpl.AllCommandeDuMois(dateCDebut, dateCFin);
	}

	@GetMapping("/AllCommandeDuMoisByCategorie")
	public double AllCommandeDuMoisByCategorie(@PathVariable Date dateCDebut, @PathVariable Date dateCFin , @PathVariable String categorie) {
		return commandeServiceImpl.AllCommandeDuMoisByCategorie(dateCDebut, dateCFin, categorie);
	}

}
