package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.Presence_EleveInterface;
import com.Rama_Solution.backend_pfe.entities.Presence_eleve;
import com.Rama_Solution.backend_pfe.repos.Presence_EleveRepository;

@Service 
public class Presence_eleveServiceImpl implements Presence_EleveInterface {
	@Autowired
	Presence_EleveRepository presence_eleveRepository;
	

	@Override
	public Presence_eleve addPresence_eleve(Presence_eleve pe) {
		return presence_eleveRepository.save(pe);
	}

	@Override
	public List<Presence_eleve> findByDatePE(Date datePE) {
		System.out.println("findByDatePE");
		return presence_eleveRepository.findByDatePE(datePE);
	}

	@Override
	public List<Presence_eleve> findByEtat(Boolean etat) {
		return presence_eleveRepository.findByEtat(etat);
	}
	
	@Override
	public List<Presence_eleve> findAllPresence_eleves() {
		return presence_eleveRepository.findAll();
	}

	@Override
	public void deletePresenceEleveByID(Long id) {
		presence_eleveRepository.deleteById(id);
	}

	@Override
	public Presence_eleve updatePresence_eleve(Presence_eleve pe) {
		return presence_eleveRepository.save(pe);
	}

	@Override
	public List<Presence_eleve> findBetween2Date(Date datePEStart, Date datePEEnd) {
		return presence_eleveRepository.findBetween2Date(datePEStart, datePEEnd);
	}


	@Override
	public List<Presence_eleve> findByEtat_Classe(Boolean etat, Long idClasse) {
		return presence_eleveRepository.findByEtat_Classe(etat, idClasse);
	}

	@Override
	public List<Presence_eleve> findByDate_Etat_Classe(Date datePE, Boolean etat, Long idClasse) {
		return presence_eleveRepository.findByDate_Etat_Classe(datePE, etat, idClasse);
	}

	@Override
	public List<Presence_eleve> findAllPresencesByIdEleve(Long IdEleve) {
		return presence_eleveRepository.findAllPresencesByIdEleve(IdEleve);
	}

	
}
