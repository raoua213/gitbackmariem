package com.Rama_Solution.backend_pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.backend_pfe.entities.Classe;
import com.Rama_Solution.backend_pfe.repos.ClasseRepository;
import com.Rama_Solution.serviceImpl.ClasseInterface;

@Service
public class ClasseServiceImpl implements ClasseInterface {
	@Autowired
	ClasseRepository classeRepository;
	
	@Override
	public Classe addClasse(Classe c) {
		return classeRepository.save(c);
	}

	@Override
	public Classe updateClasse(Classe c) {
		return classeRepository.save(c);
	}

	@Override
	public void deleteCalsseByID(Long id) {
		classeRepository.deleteById(id);
	}

	@Override
	public List<Classe> findAllClasses() {
		return classeRepository.findAll();
	}

}
