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
	
	@OneToMany (mappedBy = "fk_eleves")
	private List<Eleve> fk_eleves;
	
	
	

	public List<Eleve> getEleves() {
		return fk_eleves;
	}

	public void setEleves(List<Eleve> fk_eleves) {
		this.fk_eleves = fk_eleves;
	}

	public Classe() {
		super();
	}

	
	public Classe(Long idClasse, String nom, int nombre_eleves) {
		super();
		this.idClasse = idClasse;
		this.nom = nom;
		//this.nombre_eleves = nombre_eleves;
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

	//public int getNombre_eleves() {
	//	return nombre_eleves;
//	}

//	public void setNombre_eleves(int nombre_eleves) {
		//this.nombre_eleves = nombre_eleves;
	//}

	@Override
	public String toString() {
		return "Classe [idClasse=" + idClasse + ", nom=" + nom + ", nombre_eleves=" + "]";
	}
	
	
	
}
