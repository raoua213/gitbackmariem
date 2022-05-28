package com.Rama_Solution.Interface;

import java.util.Date;
import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Facture;

public interface FactureInterface {
	Facture addFacture(Facture f);
	void deleteFactureById(Long id);
	List<Facture> findAllFactures();
	Facture findFactureById(Long id);
	List<Facture>findFactureByIdEleve(Long IDEleve);
	List<Facture> findFactureByIdEleve_Date(Long IDEleve, Date DateF);
	List<Facture> findElevesPayed_Date(Date DateF);
	double CalculMontant(Long IDEleve, int NbMois);
	double AllPaiement_Date(Date dateF);
	double CalculSomme(Date dateC);
}
