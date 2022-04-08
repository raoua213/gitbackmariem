package com.Rama_Solution.serviceImpl;

import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Facture;

public interface FactureInterface {
	Facture addFacture(Facture f);
	void deleteFactureById(Long id);
	List<Facture> findAllFactures();
	Facture findFactureById(Long id);
}
