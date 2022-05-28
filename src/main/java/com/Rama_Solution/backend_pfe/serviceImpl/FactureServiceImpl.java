package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.FactureInterface;
import com.Rama_Solution.backend_pfe.entities.Facture;
import com.Rama_Solution.backend_pfe.repos.CommandeRepository;
import com.Rama_Solution.backend_pfe.repos.FactureRepository;

@Service
public class FactureServiceImpl implements FactureInterface {
	@Autowired
	FactureRepository factureRepository;
	@Autowired
	CommandeRepository commandeRepository;


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
	public double AllPaiement_Date(Date DateF) {
		return factureRepository.findAllPaiement_Date(DateF);
	}

	@Override
	public double CalculMontant(Long IDEleve, int NbMois) {
		return factureRepository.CalculMontant(IDEleve, NbMois);
	}
//hedhi somme 
	@Override
	public double CalculSomme(Date dateC) {
		double i = factureRepository.findAllPaiement_Date(dateC);
		double j = commandeRepository.AllCommandeDuMois(dateC, dateC);
		return i-j;
	}
	
	

}
