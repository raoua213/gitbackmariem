package com.Rama_Solution.Interface;

import java.util.Date;
import java.util.List;


import com.Rama_Solution.backend_pfe.entities.Presence_personnel;

public interface Presence_PersonnelInterface {
	Presence_personnel addPresence_personnel(Presence_personnel pp);
	List<Presence_personnel> findByDate(Date date);
	List<Presence_personnel> findByEtat(Boolean etat);
	List<Presence_personnel> findAllPresence_personnels();
	void deletePresencePersonnelByID(Long id);
	Presence_personnel updatePresence_personnel(Presence_personnel pp);
}
