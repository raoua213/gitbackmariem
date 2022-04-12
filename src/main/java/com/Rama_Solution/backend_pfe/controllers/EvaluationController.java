package com.Rama_Solution.backend_pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Evaluation;
import com.Rama_Solution.backend_pfe.serviceImpl.EvaluationServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EvaluationController {
	@Autowired
	private EvaluationServiceImpl evaluationServiceImpl;
	
	@PostMapping("/addEvaluation")
	public Evaluation addEvaluation(@RequestBody Evaluation ev) {
		return evaluationServiceImpl.addEvaluation(ev);
	}
	
	@PutMapping("/updateEvaluation")
	public Evaluation updateEvaluation(@RequestBody Evaluation ev) {
		return evaluationServiceImpl.updateEvaluation(ev);
	}
	
	@GetMapping("/findEvaluationByIDEL&IDACT/{idEleve}/{idActivite}")
	public List<Evaluation> findEvaluationByIdACT_IdEl(@PathVariable Long idEleve, @PathVariable Long idActivite) {
		return evaluationServiceImpl.findEvaluationByIdACT_IdEl(idEleve, idActivite);
	}
	
	@GetMapping("/findEvaluationById/{id}")
	public Evaluation findEvaluationById(@PathVariable Long id) {
		return evaluationServiceImpl.findEvaluationById(id);
	} 

}
