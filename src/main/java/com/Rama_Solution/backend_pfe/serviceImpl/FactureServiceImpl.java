package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.FactureInterface;
import com.Rama_Solution.backend_pfe.entities.Facture;
import com.Rama_Solution.backend_pfe.repos.FactureRepository;

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

	@Override
	public List<Facture> findFactureByIdEleve(Long IDEleve) {
		return factureRepository.findFactureByIdEleve(IDEleve);
	}

	@Override
	public List<Facture> findFactureByIdEleve_Date(Long IDEleve, Date DateF) {
		return factureRepository.findFactureByIdEleve_Date(IDEleve, DateF);
	}

	@Override
	public List<Facture> findElevesPayed_Date(Date DateF) {
		return factureRepository.findElevesPayed_Date(DateF);
	}

	@Override
	public double AllPaiement(Date dateE, double montant) {
		List<Facture> lis = factureRepository.findElevesPayed_Date(dateE);
		return lis.size()*montant;
	}

}
