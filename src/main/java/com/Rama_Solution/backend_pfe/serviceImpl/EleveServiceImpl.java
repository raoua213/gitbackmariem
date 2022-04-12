package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.EleveInterface;
import com.Rama_Solution.backend_pfe.entities.Eleve;
import com.Rama_Solution.backend_pfe.repos.EleveRepository;

@Service
public class EleveServiceImpl implements EleveInterface{
	@Autowired
	EleveRepository eleveRepository;
	

	@Override
	public void addEleve(Eleve e) {
		 eleveRepository.save(e);
	}


	@Override
	public Eleve updateEleve(Eleve e) {
		return eleveRepository.save(e);
	}

	@Override
	public void deleteEleveById(Long id) {
		eleveRepository.deleteById(id);		
	}

	@Override
	public Eleve findEleve(Long id) {
		return eleveRepository.findById(id).get();
	}
	
	@Override
	public List<Eleve> findAllEleves() {
			return eleveRepository.findAll();
			
	}

	@Override
	public List<Eleve> findEleveByIdClasse(Long IDCL) {
		return eleveRepository.findEleveByClasse(IDCL);
	}
	

}
