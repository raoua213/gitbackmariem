package com.Rama_Solution.serviceImpl;

import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Emploi;

public interface EmploiInterface {
	Emploi addEmploi(Emploi em);
	List<Emploi> findAllEmplois();
	Emploi findEmploiById(Long id);
	void deleteEmploiById(Long id);
	Emploi updateEmploi(Emploi em);

}
