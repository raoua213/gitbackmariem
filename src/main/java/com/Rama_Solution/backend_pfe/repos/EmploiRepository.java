package com.Rama_Solution.backend_pfe.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rama_Solution.backend_pfe.entities.Emploi;

public interface EmploiRepository extends JpaRepository<Emploi, Long> {

	//findDispoPersonnel
}
