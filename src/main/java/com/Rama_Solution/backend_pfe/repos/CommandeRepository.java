package com.Rama_Solution.backend_pfe.repos;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

	@Query("Select Sum(cm.montant_totale) from Commande cm where cm.date_commande between :dateCDebut and :dateCFin")
	double AllCommandeDuMois(@Param("dateCDebut") Date dateCDebut, @Param("dateCFin") Date dateCFin);
	
	@Query("Select Sum(cm.montant_totale) from Commande cm, Article art, Mouvement mv where cm.date_commande between :dateCDebut and :dateCFin and cm.idCommande = mv.fk_Com.idCommande and art.idArticle=mv.fk_Art.idArticle and art.categorie= :categorie")
	double AllCommandeDuMoisByCategorie(@Param("dateCDebut") Date dateCDebut, @Param("dateCFin") Date dateCFin , @Param("categorie") String categorie);

}
