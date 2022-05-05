package com.Rama_Solution.backend_pfe.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Eleve;

public interface EleveRepository extends JpaRepository<Eleve, Long> {
	
	@Query("SELECT e FROM Eleve e WHERE e.fk_eleves.idClasse=:IDCL")
	List<Eleve> findEleveByClasse(@Param("IDCL") Long IDCL);

	@Query("SELECT e FROM Eleve e WHERE e.nom= :nom and e.prenom= :prenom and e.tel_parent= :tel and e.date_nais= :date_nais")
	Eleve findEleveUnique(@Param("nom") String nom,@Param("prenom") String prenom,@Param("tel") String tel ,@Param("date_nais") Date date_nais);

}
