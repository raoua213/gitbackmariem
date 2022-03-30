package com.Rama_Solution.backend_pfe.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.backend_pfe.entities.Presence_personnel;
import com.Rama_Solution.backend_pfe.repos.Presence_PersonnelRepository;
import com.Rama_Solution.serviceImpl.Presence_PersonnelInterface;

@Service 
public class Presence_personnelServiceImpl implements Presence_PersonnelInterface {
	@Autowired
	Presence_PersonnelRepository presence_personnelRepository;

	@Override
	public Presence_personnel addPresence_personnel(Presence_personnel pp) {
		return presence_personnelRepository.save(pp);
	}

	@Override
	public List<Presence_personnel> findByDate(Date date) {
		return presence_personnelRepository.findByDate(date);
	}

	@Override
	public List<Presence_personnel> findByEtat(Boolean etat) {
		return presence_personnelRepository.findByEtat(etat);
		
	}

	@Override
	public List<Presence_personnel> findAllPresence_personnels() {
		return presence_personnelRepository.findAll();
	}

	@Override
	public void deletePresencePersonnelByID(Long id) {
		presence_personnelRepository.deleteById(id);
	}

	@Override
	public Presence_personnel updatePresence_personnel(Presence_personnel pp) {
		return presence_personnelRepository.save(pp);
	}

}
