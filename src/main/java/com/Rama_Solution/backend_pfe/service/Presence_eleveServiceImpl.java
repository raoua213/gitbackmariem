package com.Rama_Solution.backend_pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.backend_pfe.entities.Presence_eleve;
import com.Rama_Solution.backend_pfe.repos.Presence_EleveRepository;
import com.Rama_Solution.serviceImpl.Presence_EleveInterface;

@Service 
public class Presence_eleveServiceImpl implements Presence_EleveInterface {
	@Autowired
	Presence_EleveRepository presence_eleveRepository;

	@Override
	public Presence_eleve addPresence_eleve(Presence_eleve pe) {
		return presence_eleveRepository.save(pe);
	}

	@Override
	public Presence_eleve findByDate(Presence_eleve pe) {
		return presence_eleveRepository.findBy(null, null);
	}

	@Override
	public Presence_eleve findAllPresent(Presence_eleve pe) {
		return presence_eleveRepository.findBy(null, null);
	}
	
	@Override
	public Presence_eleve findAllAbsent(Presence_eleve pe) {
		return presence_eleveRepository.findBy(null, null);
	}
	
	@Override
	public List<Presence_eleve> findAllPresence_eleves() {
		return presence_eleveRepository.findAll();
	}

}
