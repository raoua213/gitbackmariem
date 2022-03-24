package com.Rama_Solution.serviceImpl;

import java.util.Date;
import java.util.List;


import com.Rama_Solution.backend_pfe.entities.Presence_personnel;

public interface Presence_PersonnelInterface {
	Presence_personnel addPresence_personnel(Presence_personnel pp);
	List<Presence_personnel> findByDate(Date date);
	List<Presence_personnel> findByEtat(Boolean etat);
	List<Presence_personnel> findAllPresence_personnels();
}
