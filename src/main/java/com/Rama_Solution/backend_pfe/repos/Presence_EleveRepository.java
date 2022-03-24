package com.Rama_Solution.backend_pfe.repos;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Presence_eleve;

public interface Presence_EleveRepository extends JpaRepository<Presence_eleve, Long> {

	@Query(value = "SELECT pe FROM  Presence_eleve pe WHERE pe.datePE = :datePE")
	List<Presence_eleve> findByDatePE(@Param("datePE") Date datePE);
	
	@Query("SELECT pe FROM  Presence_eleve pe WHERE pe.etat=:etat")
	List<Presence_eleve> findByEtat(@Param("etat") Boolean etat);

}
