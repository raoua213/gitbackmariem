package com.Rama_Solution.backend_pfe.entities;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	@Column(nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date from_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date to_date;
	private double montent;
	private Blob recu_paiement;
    
	
	@ManyToOne
	private Eleve factures;

	public Facture() {
		super();
	}

	
	


	public Facture(Long idFacture, Date from_date, Date to_date, double montent, Blob recu_paiement) {
		super();
		this.idFacture = idFacture;
		this.from_date = from_date;
		this.to_date = to_date;
		this.montent = montent;
		this.recu_paiement = recu_paiement;
	}





	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}

	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	public double getMontent() {
		return montent;
	}

	public void setMontent(double montent) {
		this.montent = montent;
	}

	public Blob getRecu_paiement() {
		return recu_paiement;
	}


	public void setRecu_paiement(Blob recu_paiement) {
		this.recu_paiement = recu_paiement;
	}

	public Eleve getFactures() {
		return factures;
	}


	public void setFactures(Eleve factures) {
		this.factures = factures;
	}





	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", from_date=" + from_date + ", to_date=" + to_date + ", montent="
				+ montent + ", recu_paiement=" + recu_paiement + "]";
	}

	
	
}
