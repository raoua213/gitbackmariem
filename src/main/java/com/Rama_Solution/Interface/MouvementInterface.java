package com.Rama_Solution.Interface;

import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Mouvement;

public interface MouvementInterface {
	Mouvement addMouvement(Mouvement mv);
	List<Mouvement> findAllMouvements();
	Mouvement findMouvementById(Long id);
	Mouvement updateMouvement(Mouvement mv);
	void deleteMouvement(Long id);

}
