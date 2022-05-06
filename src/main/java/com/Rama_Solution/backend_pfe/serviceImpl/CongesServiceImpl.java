package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.CongesInterface;
import com.Rama_Solution.backend_pfe.entities.Conges;
import com.Rama_Solution.backend_pfe.repos.CongesRepository;
import com.Rama_Solution.backend_pfe.repos.PersonnelRepository;

@Service
public class CongesServiceImpl implements CongesInterface {

	@Autowired
	CongesRepository congesRepository;
	
	@Autowired
	PersonnelRepository personnelRepository;
	
	@Override
	public Conges addConges(Conges co) {
		Long id = co.getConges().getIdPersonnel();
		personnelRepository.updateCongesTaken(1,id);
		return congesRepository.save(co);
	}

	@Override
	public List<Conges> findAllConges() {
		return congesRepository.findAll();
	}

	@Override
	public Conges findCongesById(Long id) {
		return congesRepository.findById(id).get();
	}


	@Override
	public List<Conges> findDispoPersonnelByConges(Long IdPersonnel, Date DateC) {
		return congesRepository.findDispoPersonnelByConges(IdPersonnel, DateC);
	}

	@Override
	public List<Conges> findCongesByIdPersonnel(Long IdPersonnel) {
		return congesRepository.findCongesByIdPersonnel(IdPersonnel);
	}

}
