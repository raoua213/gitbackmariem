package com.Rama_Solution.backend_pfe.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity 
public class Commande {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCommande;
	@Column(nullable = false)
	private double montant_totale;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date date_commande;
	
	
	@OneToMany (mappedBy = "fk_Article")
	private List<Article> fk_Article;
	
	
	
	public List<Article> getFk_Article() {
		return fk_Article;
	}

	public void setFk_Article(List<Article> fk_Article) {
		this.fk_Article = fk_Article;
	}

	public Commande() {
		super();
	}

	
	public Commande(Long idCommande, double montant_totale, Date date_commande) {
		super();
		this.idCommande = idCommande;
		this.montant_totale = montant_totale;
		this.date_commande = date_commande;
	}

	
	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public double getMontant_totale() {
		return montant_totale;
	}

	public void setMontant_totale(double montant_totale) {
		this.montant_totale = montant_totale;
	}

	public Date getDate_commande() {
		return date_commande;
	}
	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", montant_totale=" + montant_totale + ", date_commande="
				+ date_commande + "]";
	}
	
	
	

}
