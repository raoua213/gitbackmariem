package com.Rama_Solution.backend_pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.backend_pfe.entities.Activite;
import com.Rama_Solution.backend_pfe.repos.ActiviteRepository;
import com.Rama_Solution.serviceImpl.ActiviteInterface;

@Service
public class ActiviteServiceImpl implements ActiviteInterface {

	@Autowired
	ActiviteRepository activiteRepository;
	
	@Override
	public Activite addActivite(Activite act) {
		return activiteRepository.save(act);
	}

	@Override
	public Activite updateActivite(Activite act) {
		return activiteRepository.save(act);
	}

	@Override
	public void deleteActiviteById(Long id) {
		activiteRepository.deleteById(id);
	}

	@Override
	public List<Activite> findAllActivites() {
		return activiteRepository.findAll();
	}

	@Override
	public Activite findActiviteById(Long id) {
		return activiteRepository.findById(id).get();
	}

}
