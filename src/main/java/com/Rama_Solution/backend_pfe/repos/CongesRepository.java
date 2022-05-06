package com.Rama_Solution.backend_pfe.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Conges;

public interface CongesRepository extends JpaRepository<Conges, Long> {
	
		
	@Query("Select co From Conges co Where co.conges.idPersonnel= :IdPersonnel and co.dateC= :DateC")
	List<Conges> findDispoPersonnelByConges(@Param("IdPersonnel") Long IdPersonnel, @Param("DateC") Date DateC);
	
	@Query("Select co From Conges co Where co.conges.idPersonnel= :IdPersonnel order by co.dateC DESC")
	List<Conges> findCongesByIdPersonnel(@Param("IdPersonnel") Long IdPersonnel);
	
}
