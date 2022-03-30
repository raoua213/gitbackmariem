package com.Rama_Solution.serviceImpl;

import java.util.Date;
import java.util.List;


import com.Rama_Solution.backend_pfe.entities.Presence_eleve;

public interface Presence_EleveInterface {
	Presence_eleve addPresence_eleve(Presence_eleve pe);
	List<Presence_eleve> findByDatePE(Date datePE);
	List<Presence_eleve> findBetween2Date(Date datePEStart, Date datePEEnd);
	List<Presence_eleve> findByEtat(Boolean etat);
	List<Presence_eleve> findByEtat_Classe(Boolean etat, Long idClasse);
	List<Presence_eleve> findByDate_Etat_Classe(Date datePE, Boolean etat, Long idClasse);
	List<Presence_eleve> findAllPresence_eleves();
	void deletePresenceEleveByID(Long id);
	Presence_eleve updatePresence_eleve(Presence_eleve  pe);

}
