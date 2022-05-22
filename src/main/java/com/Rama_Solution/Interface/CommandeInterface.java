package com.Rama_Solution.Interface;

import java.util.Date;
import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Commande;

public interface CommandeInterface {
	Commande addCommande(Commande cm);
	List<Commande> findAllCommandes();
	Commande findCommandeById(Long id);
	void deleteCommandeById(Long id);
	Commande updateCommande(Commande cm);
	double AllCommandeDuMois(Date dateCDebut, Date dateCFin);
}
