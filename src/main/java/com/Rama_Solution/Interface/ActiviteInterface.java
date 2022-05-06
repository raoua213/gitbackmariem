package com.Rama_Solution.Interface;

import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Activite;

public interface ActiviteInterface {	
	Activite addActivite(Activite act);
	Activite updateActivite(Activite act);
	void deleteActiviteById(Long id);
	List<Activite> findAllActivites();
	Activite findActiviteById(Long id);
	List<Activite> findActiviteByIdPersonnel(Long IDPersonnel);
	List<Activite> findActiviteByIdClasse(Long IdClasse);

}
