package com.Rama_Solution.serviceImpl;

import java.util.Date;
import java.util.List;


import com.Rama_Solution.backend_pfe.entities.Presence_eleve;

public interface Presence_EleveInterface {
	Presence_eleve addPresence_eleve(Presence_eleve pe);
	List<Presence_eleve> findByDatePE(Date datePE);
	List<Presence_eleve> findByEtat(Boolean etat);
	List<Presence_eleve> findAllPresence_eleves();

}
