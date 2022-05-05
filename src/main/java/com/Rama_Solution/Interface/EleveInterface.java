package com.Rama_Solution.Interface;

import java.util.Date;
import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Eleve;

public interface EleveInterface {
	void addEleve(Eleve e);
	Eleve updateEleve(Eleve e);
	void deleteEleveById(Long id);
	Eleve findEleve(Long id);
	List<Eleve> findAllEleves();
	List<Eleve> findEleveByIdClasse(Long IDCL);
	Eleve findEleveUnique(String nom, String prenom, String tel ,Date date_nais);
}
