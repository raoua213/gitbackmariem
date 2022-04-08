package com.Rama_Solution.backend_pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.backend_pfe.entities.Facture;
import com.Rama_Solution.backend_pfe.repos.FactureRepository;
import com.Rama_Solution.serviceImpl.FactureInterface;

@Service
public class FactureServiceImpl implements FactureInterface {
	@Autowired
	FactureRepository factureRepository;

	@Override
	public Facture addFacture(Facture f) {
		return factureRepository.save(f);
	}

	@Override
	public void deleteFactureById(Long id) {
		factureRepository.deleteById(id);
	}

	@Override
	public List<Facture> findAllFactures() {
		return factureRepository.findAll();
	}

	@Override
	public Facture findFactureById(Long id) {
		return factureRepository.findById(id).get();
	}

}
