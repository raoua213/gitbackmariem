package com.Rama_Solution.backend_pfe.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rama_Solution.backend_pfe.entities.Fiche_de_paie;

public interface FicheRepository extends JpaRepository<Fiche_de_paie, Long> {

	//findFicheByIdPersonnel
	//findFicheByIdPersonnel_Date
}
