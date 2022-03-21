package com.Rama_Solution.backend_pfe.service;

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
	public Presence_personnel findByDate(Presence_personnel pp) {
		return presence_personnelRepository.findBy(null, null);
	}

	@Override
	public Presence_personnel findByEtat(Presence_personnel pp) {
		return presence_personnelRepository.findBy(null, null);
	}

	@Override
	public List<Presence_personnel> findAllPresence_personnels() {
		return presence_personnelRepository.findAll();
	}

}
