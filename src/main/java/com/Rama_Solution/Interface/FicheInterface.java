package com.Rama_Solution.Interface;

import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Fiche_de_paie;

public interface FicheInterface {
	Fiche_de_paie addFiche(Fiche_de_paie fiche);
	Fiche_de_paie findFicheById(Long id);
	List<Fiche_de_paie> findAllFiche();
	void deleteFicheById(Long id);

}
