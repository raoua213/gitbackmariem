package com.Rama_Solution.backend_pfe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity 
public class Mouvement {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idMouvement;
	@Column(nullable = false)
	private double quantite;
	
	
	@ManyToOne
	private Article fk_Art;
	
	@ManyToOne
	private Commande fk_Com;
	
	public Article getFk_Art() {
		return fk_Art;
	}

	public void setFk_Art(Article fk_Art) {
		this.fk_Art = fk_Art;
	}

	
	public Commande getFk_Com() {
		return fk_Com;
	}

	public void setFk_Com(Commande fk_Com) {
		this.fk_Com = fk_Com;
	}

	public Mouvement() {
		super();
	}
	
	public Mouvement(Long idMouvement, double quantite) {
		super();
		this.idMouvement = idMouvement;
		this.quantite = quantite;
	}
	
	public Long getIdMouvement() {
		return idMouvement;
	}
	public void setIdMouvement(Long idMouvement) {
		this.idMouvement = idMouvement;
	}
	
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	
	
	@Override
	public String toString() {
		return "Mouvement [idMouvement=" + idMouvement + ", quantite=" + quantite + "]";
	}
	
	
}
