package com.Rama_Solution.serviceImpl;

import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Evaluation;

public interface EvaluationInterface {
	Evaluation addEvaluation(Evaluation ev);
	Evaluation updateEvaluation(Evaluation ev);
	List<Evaluation> findEvaluationByIdACT_IdEl(Long idEleve, Long idActivite);
	Evaluation findEvaluationById(Long id); 

}
