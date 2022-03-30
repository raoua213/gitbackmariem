package com.Rama_Solution.backend_pfe.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Eleve;

public interface EleveRepository extends JpaRepository<Eleve, Long> {
	
	@Query("SELECT e FROM Eleve e WHERE e.eleves.idClasse=:IDCL")
	List<Eleve> findEleveByClasse(@Param("IDCL") Long IDCL);

}
