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
	
	@OneToMany (mappedBy = "consoms")
	private List<Consomable> consoms;
	
	
	public List<Consomable> getConsoms() {
		return consoms;
	}
	public void setConsoms(List<Consomable> consoms) {
		this.consoms = consoms;
	}
	@OneToMany (mappedBy = "stocks")
	private List<Stock> stocks;
	
	
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	public Article() {
		super();
	}
	public Article(Long idArticle, String labelle, double prix, String categorie) {
		super();
		this.idArticle = idArticle;
		this.labelle = labelle;
		this.prix = prix;
		this.categorie = categorie;
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
	@Override
	public String toString() {
		return "article [idArticle=" + idArticle + ", labelle=" + labelle + ", prix=" + prix + ", categorie="
				+ categorie + "]";
	}
	
	
	
	
}
