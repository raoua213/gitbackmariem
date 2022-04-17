package com.Rama_Solution.backend_pfe.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rama_Solution.backend_pfe.entities.Classe;

public interface ClasseRepository  extends JpaRepository<Classe, Long>  {
	
	/*@Query("Select count(*), C.nom From Classe C group by C.nom")
	List<Classe> countNbEleve();*/

}