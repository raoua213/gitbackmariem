package com.Rama_Solution.backend_pfe.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
public class Stock {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idStock;
	@Column(nullable = false)
	private double quantite;
	private Date date_fin_stock;
	private Date date_commande;
	
	@ManyToOne
	private Article stocks;
	
	public Article getStocks() {
		return stocks;
	}

	public void setStocks(Article stocks) {
		this.stocks = stocks;
	}

	public Stock() {
		super();
	}

	public Long getIdStock() {
		return idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public Stock(double quantite, Date date_fin_stock, Date date_commande) {
		super();
		this.quantite = quantite;
		this.date_fin_stock = date_fin_stock;
		this.date_commande = date_commande;
	}

	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public Date getDate_fin_stock() {
		return date_fin_stock;
	}
	public void setDate_fin_stock(Date date_fin_stock) {
		this.date_fin_stock = date_fin_stock;
	}
	public Date getDate_commande() {
		return date_commande;
	}
	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}
	@Override
	public String toString() {
		return "stock [idStock=" + idStock + ", quantite=" + quantite + ", date_fin_stock=" + date_fin_stock
				+ ", date_commande=" + date_commande + "]";
	}
	
	

}
