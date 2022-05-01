package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.PersonnelInterface;
import com.Rama_Solution.backend_pfe.entities.Personnel;
import com.Rama_Solution.backend_pfe.repos.PersonnelRepository;

@Service
public class PersonnelServiceImpl implements PersonnelInterface {

	@Autowired
	PersonnelRepository personnelRepository; 
	
	@Override
	public Personnel addPersonnel(Personnel p) {
		return personnelRepository.save(p);
	}

	@Override
	public Personnel updatePersonnel(Personnel p) {
		return personnelRepository.save(p);
	}

	@Override
	public void deletePersonnelById(Long id) {
		personnelRepository.deleteById(id);
	}

	@Override
	public Personnel findPersonnel(Long id) {
		return personnelRepository.findById(id).get();
	}

	@Override
	public List<Personnel> findAllPersonnels() {
		return personnelRepository.findAll();
	}

	@Override
	public List<Personnel> findPersonnelsByFonction(String fonction) {
		return personnelRepository.findPersonnelsByFonction(fonction);
	}

	@Override
	public void updateCongesTaken(int nb_jour, Long IdPersonnel) {
		personnelRepository.updateCongesTaken(nb_jour, IdPersonnel);
	}

	//@Override
	//public void updateCongesReste(Long IdPersonnel) {
		//personnelRepository.updateCongesReste(IdPersonnel);
	//}

}
