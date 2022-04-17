package com.Rama_Solution.backend_pfe.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.Rama_Solution.backend_pfe.entities.Personnel;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
	
	@Query("SELECT p FROM Personnel p WHERE p.fonction = :fonction" )
	List<Personnel> findPersonnelsByFonction(@Param("fonction") String fonction);
	@Transactional
	@Modifying
	@Query("update Personnel P set P.nb_jour_taken = P.nb_jour_taken + :nb_jour Where P.idPersonnel= :IdPersonnel")
	void updateCongesTaken(@Param("nb_jour") int nb_jour, @Param("IdPersonnel") Long IdPersonnel);
	@Transactional
	@Modifying
	@Query("update Personnel P set P.nb_jour_reste = P.nb_jour_initiale - nb_jour_taken Where P.idPersonnel= :IdPersonnel")
	void updateCongesReste(@Param("IdPersonnel") Long IdPersonnel);

}
