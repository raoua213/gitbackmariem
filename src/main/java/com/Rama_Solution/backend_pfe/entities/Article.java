package com.Rama_Solution.backend_pfe.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Article {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idArticle;
	@Column(nullable = false)
	private String labelle;
	@Column(nullable = false)
	private double prix;
	private String categorie;
	private double quantité;

	@OneToMany (mappedBy = "fk_Art")
	private List<Mouvement> fk_Art;
	
	public List<Mouvement> getFk_Art() {
		return fk_Art;
	}
	public void setFk_Art(List<Mouvement> fk_Art) {
		this.fk_Art = fk_Art;
	}
	
	
	
	public Article() {
		super();
	}
	
	public Article(Long idArticle, String labelle, double prix, String categorie, double quantité) {
		super();
		this.idArticle = idArticle;
		this.labelle = labelle;
		this.prix = prix;
		this.categorie = categorie;
		this.quantité = quantité;
	}
	public Long getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}
	public String getLabelle() {
		return labelle;
	}
	public void setLabelle(String labelle) {
		this.labelle = labelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public double getQuantité() {
		return quantité;
	}
	public void setQuantité(double quantité) {
		this.quantité = quantité;
	}
	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", labelle=" + labelle + ", prix=" + prix + ", categorie="
				+ categorie + ", quantité=" + quantité + "]";
	}
	
	
	
	
	
}
