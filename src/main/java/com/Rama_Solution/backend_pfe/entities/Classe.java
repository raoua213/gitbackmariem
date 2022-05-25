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
	@Column(nullable = false)
	private double prix_mois;
	
	public double getPrix_mois() {
		return prix_mois;
	}

	public void setPrix_mois(double prix_mois) {
		this.prix_mois = prix_mois;
	}

	@OneToMany (mappedBy = "fk_eleves")
	private List<Eleve> fk_eleves;
	
	@OneToMany (mappedBy = "fk_activites")
	private List<Activite> fk_activites;
	

	public List<Eleve> getFk_eleves() {
		return fk_eleves;
	}

	public void setFk_eleves(List<Eleve> fk_eleves) {
		this.fk_eleves = fk_eleves;
	}

	public List<Activite> getFk_activites() {
		return fk_activites;
	}

	public void setFk_activites(List<Activite> fk_activites) {
		this.fk_activites = fk_activites;
	}

	public List<Eleve> getEleves() {
		return fk_eleves;
	}

	public void setEleves(List<Eleve> fk_eleves) {
		this.fk_eleves = fk_eleves;
	}

	public Classe() {
		super();
	}

	

	public Classe(Long idClasse, String nom, double prix_mois) {
		super();
		this.idClasse = idClasse;
		this.nom = nom;
		this.prix_mois = prix_mois;
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
		return "Classe [idClasse=" + idClasse + ", nom=" + nom + ", prix_mois=" + prix_mois + "]";
	}


	
	
}
