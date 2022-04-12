package com.Rama_Solution.backend_pfe.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rama_Solution.backend_pfe.entities.Activite;

public interface ActiviteRepository extends JpaRepository<Activite, Long> {

	//findActiviteByIdPersonnel
}
