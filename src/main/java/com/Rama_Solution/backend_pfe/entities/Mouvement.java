package com.Rama_Solution.backend_pfe.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity 
public class Mouvement {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idMouvement;
	@Column(nullable = false)
	private double quantite_consome;
	@Column(nullable = false)
	private double quantite_reste;
	@Column(nullable = false)
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dateCon;
	
	
	@ManyToOne
	private Article fk_Art;
	
	
	public Article getFk_Art() {
		return fk_Art;
	}

	public void setFk_Art(Article fk_Art) {
		this.fk_Art = fk_Art;
	}

	public Mouvement() {
		super();
	}
	
	public Mouvement(Long idMouvement, double quantite_consome, double quantite_reste, Date dateCon) {
		super();
		this.idMouvement = idMouvement;
		this.quantite_consome = quantite_consome;
		this.quantite_reste = quantite_reste;
		this.dateCon = dateCon;
	}
	
	public Long getIdMouvement() {
		return idMouvement;
	}
	public void setIdMouvement(Long idMouvement) {
		this.idMouvement = idMouvement;
	}
	public double getQuantite_reste() {
		return quantite_reste;
	}
	public void setQuantite_reste(double quantite_reste) {
		this.quantite_reste = quantite_reste;
	}
	public double getQuantite_consome() {
		return quantite_consome;
	}
	public void setQuantite_consome(double quantite_consome) {
		this.quantite_consome = quantite_consome;
	}
	
	public Date getDateCon() {
		return dateCon;
	}
	public void setDateCon(Date dateCon) {
		this.dateCon = dateCon;
	}
	@Override
	public String toString() {
		return "Mouvement [idMouvement=" + idMouvement + ", quantite_consome=" + quantite_consome + ", quantite_reste="
				+ quantite_reste + ", dateCon=" + dateCon + "]";
	}
	
	
}
