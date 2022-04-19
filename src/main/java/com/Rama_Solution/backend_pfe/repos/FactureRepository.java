package com.Rama_Solution.backend_pfe.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {
	
	@Query("SELECT f FROM Facture f WHERE f.factures.idEleve = :IDEleve Order By f.to_date ")
	List<Facture> findFactureByIdEleve(@Param("IDEleve") Long IDEleve);
	@Query("SELECT f FROM Facture f WHERE f.factures.idEleve = :IDEleve and :DateF between f.from_date and f.to_date")
	List<Facture> findFactureByIdEleve_Date(@Param("IDEleve") Long IDEleve, @Param("DateF") Date DateF);
	@Query("SELECT f.factures.nom, f.factures.prenom FROM Facture f WHERE :DateF between f.from_date and f.to_date")
	List<Facture> findElevesPayed_Date(@Param("DateF") Date DateF);

}
