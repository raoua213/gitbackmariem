package com.Rama_Solution.serviceImpl;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.Rama_Solution.backend_pfe.entities.Presence_personnel;

public interface Presence_PersonnelInterface {
	Presence_personnel addPresence_personnel(Presence_personnel pp);
	@Query(value = "SELECT pp FROM  Presence_personnel WHERE pp.datePP = :datePP")
	Presence_personnel findByDate(Presence_personnel pp);
	@Query(value = "SELECT pp FROM Presence_personnel WHERE pp.etat = true")
	Presence_personnel findByEtat(Presence_personnel pp);
	List<Presence_personnel> findAllPresence_personnels();
}
