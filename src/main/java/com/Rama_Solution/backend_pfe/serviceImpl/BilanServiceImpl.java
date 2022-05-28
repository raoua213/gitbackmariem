package com.Rama_Solution.backend_pfe.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

public class BilanServiceImpl {
	@Autowired
	FactureServiceImpl factureServiceImpl;
	@Autowired
	CommandeServiceImpl commandeServiceImpl;
	@Autowired
	FicheServiceImpl ficheServiceImpl;

}
