package com.Rama_Solution.backend_pfe.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Presence_personnel;

public interface Presence_PersonnelRepository extends JpaRepository<Presence_personnel, Long> {

	@Query("SELECT pp FROM Presence_personnel pp WHERE pp.date=:date")
	List<Presence_personnel> findByDate(@Param("date") Date date);
	@Query("SELECT pp FROM  Presence_personnel pp WHERE pp.etat=:etat")
	List<Presence_personnel> findByEtat(@Param("etat") Boolean etat);
	
	@Query("SELECT count(*) FROM Presence_personnel pp WHERE pp.presence.idPersonnel= :idPersonnel and pp.date between :dateDebut and :dateFin and pp.etat= false")
	int findAllAbsentByIdPersonnel_Date(@Param("idPersonnel") Long idPersonnel, @Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}
