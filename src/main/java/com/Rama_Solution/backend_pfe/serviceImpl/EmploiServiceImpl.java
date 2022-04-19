package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.EmploiInterface;
import com.Rama_Solution.backend_pfe.entities.Emploi;
import com.Rama_Solution.backend_pfe.repos.EmploiRepository;

@Service
public class EmploiServiceImpl implements EmploiInterface {
	@Autowired
	EmploiRepository emploiRepository;
	
	@Override
	public Emploi addEmploi(Emploi em) {
		return emploiRepository.save(em);
	}

	@Override
	public List<Emploi> findAllEmplois() {
		return emploiRepository.findAll();
	}

	@Override
	public Emploi findEmploiById(Long id) {
		return emploiRepository.findById(id).get();
	}

	@Override
	public void deleteEmploiById(Long id) {
		emploiRepository.deleteById(id);
	}

	@Override
	public Emploi updateEmploi(Emploi em) {
		return emploiRepository.save(em);
	}

	@Override
	public List<Emploi> findDispoPersonnel(Long IdPersonnel, Date DateE) {
		return emploiRepository.findDispoPersonnel(IdPersonnel, DateE);
	}

}
