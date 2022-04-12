package com.Rama_Solution.backend_pfe.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Personnel;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
	
	@Query("SELECT p FROM Personnel p WHERE p.fonction = :fonction" )
	List<Personnel> findPersonnelsByFonction(@Param("fonction") String fonction);
	//@Query("update ")
	//String updateConges(@Param("nb_jour") int nb_jour);

}
