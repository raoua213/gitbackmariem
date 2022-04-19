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
	
	
	@Query(value = "SELECT pe FROM  Presence_eleve pe WHERE pe.datePE between :datePEStart and :datePEEnd")
	List<Presence_eleve> findBetween2Date(@Param("datePEStart") Date datePEStart, @Param("datePEEnd") Date datePEEnd);
	
	@Query("SELECT pe FROM  Presence_eleve pe WHERE pe.etat=:etat")
	List<Presence_eleve> findByEtat(@Param("etat") Boolean etat);
	
	@Query("SELECT pe, e.nom, e.prenom FROM  Presence_eleve pe , Eleve e WHERE pe.etat=:etat and pe.presence.idEleve=e.idEleve and e.fk_eleves.idClasse=:idClasse")
	List<Presence_eleve> findByEtat_Classe(@Param("etat") Boolean etat, @Param("idClasse") Long idClasse);

	@Query("SELECT pe, e.nom, e.prenom FROM  Presence_eleve pe , Eleve e WHERE pe.datePE = :datePE and pe.etat=:etat and pe.presence.idEleve=e.idEleve and e.fk_eleves.idClasse=:idClasse")
	List<Presence_eleve> findByDate_Etat_Classe(@Param("datePE") Date datePE, @Param("etat") Boolean etat, @Param("idClasse") Long idClasse);


}
