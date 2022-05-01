package com.Rama_Solution.backend_pfe.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Emploi;

public interface EmploiRepository extends JpaRepository<Emploi, Long> {

	//findDispoPersonnel
	@Query("Select em From Emploi em Where em.fk_emploi2.idPersonnel= :IdPersonnel and em.date_emp= :DateE")
	List<Emploi> findDispoPersonnel(@Param("IdPersonnel") Long IdPersonnel, @Param("DateE") Date DateE);
	
	
}
