package com.Rama_Solution.Interface;

import java.util.Date;
import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Conges;

public interface CongesInterface {
	Conges addConges(Conges co);
	List<Conges> findAllConges();
	Conges findCongesById(Long id);
	List<Conges> findDispoPersonnelByConges(Long IdPersonnel, Date DateC);
	List<Conges> findCongesByIdPersonnel(Long IdPersonnel);

}
