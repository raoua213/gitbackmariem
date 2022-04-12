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

import com.Rama_Solution.backend_pfe.entities.Activite;
import com.Rama_Solution.backend_pfe.serviceImpl.ActiviteServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ActiviteController {
	@Autowired
	private ActiviteServiceImpl activiteServiceImpl;
	
	@PostMapping("/addActivite")
	public Activite addActivite(@RequestBody Activite act) {
		return activiteServiceImpl.addActivite(act);
	}
	
	@PutMapping("/updateActivite")
	public Activite updateActivite(@RequestBody Activite act) {
		return activiteServiceImpl.updateActivite(act);
	}
	
	@DeleteMapping("/deleteActiviteById")
	public void deleteActiviteById(@RequestParam Long id) {
		activiteServiceImpl.deleteActiviteById(id);
	}
	
	@GetMapping("/findAllActivites")
	public List<Activite> findAllActivites(){
		return activiteServiceImpl.findAllActivites();
	}
	
	@GetMapping("/findActiviteById")
	public Activite findActiviteById(@RequestParam Long id) {
		return activiteServiceImpl.findActiviteById(id);
	}
}
