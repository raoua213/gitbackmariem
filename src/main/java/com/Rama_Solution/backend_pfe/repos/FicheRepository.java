package com.Rama_Solution.backend_pfe.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Fiche_de_paie;

public interface FicheRepository extends JpaRepository<Fiche_de_paie, Long> {

	//findFicheByIdPersonnel
	@Query("Select fi From Fiche_de_paie fi where fi.fiche.idPersonnel= :IDP")
	List <Fiche_de_paie> findFicheByIdPersonnel(@Param("IDP") Long IDP);
	//findFicheByIdPersonnel_Date
	@Query("Select fi From Fiche_de_paie fi where fi.fiche.idPersonnel= :IDP and fi.dateF= :dateF")
	List <Fiche_de_paie> findFicheByIdPersonnel_Date(@Param("IDP") Long IDP, @Param("dateF") Date dateF);
	
	@Query("Select Sum(fi.salaire_brut) From Fiche_de_paie fi Where fi.dateF between :DateDebut and :DateFin")
	double findAllSalaires_Date(@Param("DateDebut") Date DateDebut, @Param("DateFin") Date DateFin);
}

