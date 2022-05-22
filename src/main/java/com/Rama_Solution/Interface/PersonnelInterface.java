
package com.Rama_Solution.Interface;

import java.util.Date;
import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Personnel;

public interface PersonnelInterface {
	Personnel addPersonnel(Personnel p);
	Personnel updatePersonnel(Personnel p);
	void deletePersonnelById(Long id);
	Personnel findPersonnel(Long id);
	List<Personnel> findAllPersonnels();
	List<Personnel> findPersonnelsByFonction(String fonction);
	void updateCongesTaken(int nb_jour,Long IdPersonnel);
	Personnel findByCIN(String cin);
	double findSalaireByIdPersonnel_Date(Long idPersonnel, Date dateDebut, Date dateFin, double montant);
}
