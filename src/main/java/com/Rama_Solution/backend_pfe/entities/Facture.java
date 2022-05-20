package com.Rama_Solution.backend_pfe.entities;

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
	private boolean etat;
	//Creating PDF document object 
    
	
	@ManyToOne
	private Eleve factures;

	public Facture() {
		super();
	}

	
	public Facture(Long idFacture, Date from_date, Date to_date, double montent, boolean etat, Eleve factures) {
		super();
		this.idFacture = idFacture;
		this.from_date = from_date;
		this.to_date = to_date;
		this.montent = montent;
		this.etat = etat;
		this.factures = factures;
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


	public boolean isEtat() {
		return etat;
	}


	public void setEtat(boolean etat) {
		this.etat = etat;
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
				+ montent + ", etat=" + etat + ", factures=" + factures + "]";
	}

	
}
