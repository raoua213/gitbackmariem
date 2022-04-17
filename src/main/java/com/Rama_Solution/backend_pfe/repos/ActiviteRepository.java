package com.Rama_Solution.backend_pfe.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Activite;

public interface ActiviteRepository extends JpaRepository<Activite, Long> {

	//findActiviteByIdPersonnel
	@Query("Select act From Activite act, Emploi em, Personnel p Where act.idActivite = em.fk_emploi.idActivite and p.idPersonnel = em.fk_emploi2.idPersonnel and em.fk_emploi2.idPersonnel= :IDPersonnel")
	List<Activite> findActiviteByIdPersonnel(@Param("IDPersonnel") Long IDPersonnel);
}
