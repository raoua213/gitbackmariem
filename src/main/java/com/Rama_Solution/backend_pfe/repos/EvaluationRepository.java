package com.Rama_Solution.backend_pfe.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

	@Query("SELECT ev FROM Evaluation ev where ev.fk_evaluation.idEleve=:idEleve and ev.fk_evaluation2.idActivite=:idActivite")
	List<Evaluation> findEvaluationByIdACT_IdEl(@Param("idEleve") Long idEleve, @Param("idActivite") Long idActivite);
}
