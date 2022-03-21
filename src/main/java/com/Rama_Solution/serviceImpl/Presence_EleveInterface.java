package com.Rama_Solution.serviceImpl;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.Rama_Solution.backend_pfe.entities.Presence_eleve;

public interface Presence_EleveInterface {
	Presence_eleve addPresence_eleve(Presence_eleve pe);
	@Query(value = "SELECT pe FROM  Presence_eleve WHERE pe.datePE = :datePE")
	Presence_eleve findByDate(Presence_eleve pe);
	@Query(value = "SELECT pe FROM  Presence_eleve WHERE pe.etat = true")
	Presence_eleve findAllPresent(Presence_eleve pe);
	@Query(value = "SELECT pe FROM  Presence_eleve WHERE pe.etat = false")
	Presence_eleve findAllAbsent(Presence_eleve pe);
	List<Presence_eleve> findAllPresence_eleves();
}
