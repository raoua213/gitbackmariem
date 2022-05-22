package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.CommandeInterface;
import com.Rama_Solution.backend_pfe.entities.Commande;
import com.Rama_Solution.backend_pfe.repos.CommandeRepository;

@Service
public class CommandeServiceImpl implements CommandeInterface {
	@Autowired
	CommandeRepository commandeRepository;

	@Override
	public Commande addCommande(Commande cm) {
		return commandeRepository.save(cm);
	}

	@Override
	public List<Commande> findAllCommandes() {
		return commandeRepository.findAll();
	}

	@Override
	public Commande findCommandeById(Long id) {
		return commandeRepository.findById(id).get();
	}

	@Override
	public void deleteCommandeById(Long id) {
		commandeRepository.deleteById(id);
	}

	@Override
	public Commande updateCommande(Commande cm) {
		return commandeRepository.save(cm);
	}

	@Override
	public double AllCommandeDuMois(Date dateCDebut, Date dateCFin) {
		return commandeRepository.AllCommandeDuMois(dateCDebut, dateCFin); 
	}

}
