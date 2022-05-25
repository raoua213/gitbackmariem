package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.Date;
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
	@Autowired
	Presence_personnelServiceImpl presence_personnelServiceImpl;
	
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

	@Override
	public Personnel findByCIN(String cin) {
		return personnelRepository.findByCIN(cin);
	}

	@Override
	public double findSalaireByIdPersonnel_Date(Long idPersonnel, Date dateDebut, Date dateFin) {
		int i = presence_personnelServiceImpl.findAllAbsentByIdPersonnel_Date(idPersonnel, dateDebut, dateFin);
		Personnel p = personnelRepository.findById(idPersonnel).get();
		return p.getSalaire_de_base()-(i*(p.getSalaire_de_base()/20));
	}

	

}
