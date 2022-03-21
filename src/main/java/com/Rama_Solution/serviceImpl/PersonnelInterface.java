
package com.Rama_Solution.serviceImpl;

import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Personnel;

public interface PersonnelInterface {
	Personnel addPersonnel(Personnel p);
	Personnel updatePersonnel(Personnel p);
	void deletePersonnelById(Long id);
	Personnel findPersonnel(Long id);
	List<Personnel> findAllPersonnels();
}
