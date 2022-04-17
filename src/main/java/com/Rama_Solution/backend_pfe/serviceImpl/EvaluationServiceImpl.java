package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.EvaluationInterface;
import com.Rama_Solution.backend_pfe.entities.Evaluation;
import com.Rama_Solution.backend_pfe.repos.EvaluationRepository;

@Service
public class EvaluationServiceImpl implements EvaluationInterface {
	@Autowired
	EvaluationRepository evaluationRepository; 

	@Override
	public Evaluation addEvaluation(Evaluation ev) {
		return evaluationRepository.save(ev);
	}

	@Override
	public Evaluation updateEvaluation(Evaluation ev) {
		return evaluationRepository.save(ev);
	}

	@Override
	public List<Evaluation> findEvaluationByIdACT_IdEl(Long idEleve, Long idActivite) {
		return evaluationRepository.findEvaluationByIdACT_IdEl(idEleve, idActivite);
	}

	@Override
	public Evaluation findEvaluationById(Long id) {
		return evaluationRepository.findById(id).get();
	}

	@Override
	public List<Evaluation> findEvaluationByIdEl(Long idEleve) {
		return evaluationRepository.findEvaluationByIdEl(idEleve);
	}

	@Override
	public void deleteEvaluationById(Long id) {
		evaluationRepository.deleteById(id);
	}

}
