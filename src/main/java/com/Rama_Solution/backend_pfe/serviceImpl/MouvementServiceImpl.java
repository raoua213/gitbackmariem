package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.MouvementInterface;
import com.Rama_Solution.backend_pfe.entities.Mouvement;
import com.Rama_Solution.backend_pfe.repos.MouvementRepository;

@Service
public class MouvementServiceImpl implements MouvementInterface {
	@Autowired
		MouvementRepository mouvementRepository;
	@Override
	public Mouvement addMouvement(Mouvement mv) {
		return mouvementRepository.save(mv);
	}

	@Override
	public List<Mouvement> findAllMouvements() {
		return mouvementRepository.findAll();
	}

	@Override
	public Mouvement findMouvementById(Long id) {
		return mouvementRepository.findById(id).get();
	}

	@Override
	public Mouvement updateMouvement(Mouvement mv) {
		return mouvementRepository.save(mv);
	}

	@Override
	public void deleteMouvement(Long id) {
		mouvementRepository.deleteById(id);
	}

}
