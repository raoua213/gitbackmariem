package com.Rama_Solution.backend_pfe.repos;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

	@Query("Select Sum(cm.montant_totale) from Commande cm where cm.date_commande between :dateCDebut and :dateCFin")
	double AllCommandeDuMois(@Param("dateCDebut") Date dateCDebut, @Param("dateCFin") Date dateCFin);
	
	/*@Query("select cm From Commande cm group by cm.date_commande asc")
	List<Commande> find*/
}
