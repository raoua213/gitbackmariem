package com.Rama_Solution.backend_pfe.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.Interface.FicheInterface;
import com.Rama_Solution.backend_pfe.entities.Fiche_de_paie;
import com.Rama_Solution.backend_pfe.repos.FicheRepository;

@Service
public class FicheServiceImpl implements FicheInterface {
	@Autowired
	FicheRepository ficheRepository;

	@Override
	public Fiche_de_paie addFiche(Fiche_de_paie fiche) {
		return ficheRepository.save(fiche);
	}

	@Override
	public Fiche_de_paie findFicheById(Long id) {
		return ficheRepository.findById(id).get();
	}

	@Override
	public List<Fiche_de_paie> findAllFiche() {
		return ficheRepository.findAll();
	}

	@Override
	public void deleteFicheById(Long id) {
		ficheRepository.deleteById(id);
	}

	@Override
	public List<Fiche_de_paie> findFicheByIdPersonnel(Long IDP) {
		return ficheRepository.findFicheByIdPersonnel(IDP);
	}

	@Override
	public List<Fiche_de_paie> findFicheByIdPersonnel_Date(Long IDP, Date dateF) {
		return ficheRepository.findFicheByIdPersonnel_Date(IDP, dateF);
	}

	@Override
	public double findAllSalaires_Date(Date DateDebut, Date DateFin) {
		return ficheRepository.findAllSalaires_Date(DateDebut, DateFin);
	}

}
