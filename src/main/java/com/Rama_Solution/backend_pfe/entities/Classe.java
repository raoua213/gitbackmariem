package com.Rama_Solution.backend_pfe.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classe {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idClasse;
	@Column(nullable = false)
	private String nom;

	@OneToMany (mappedBy = "eleves")
	private List<Eleve> eleves;
	
	
	

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	public Classe() {
		super();
	}

	public Classe(String nom) {
		super();
		this.nom = nom;
	}

	public Long getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(Long idClasse) {
		this.idClasse = idClasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "classe [nom=" + nom + "]";
	}
	
	
}
