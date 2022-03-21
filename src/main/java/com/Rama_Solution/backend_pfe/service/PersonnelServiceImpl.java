package com.Rama_Solution.backend_pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.backend_pfe.entities.Personnel;
import com.Rama_Solution.backend_pfe.repos.PersonnelRepository;
import com.Rama_Solution.serviceImpl.PersonnelInterface;

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

}
