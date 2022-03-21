package com.Rama_Solution.backend_pfe.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
public class Facture {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idFacture;
	@Column(nullable = false)
	private Date last_payed_month;
	private double montent;
	
	@ManyToOne
	private Eleve factures;
	
	public Facture() {
		super();
	}

	public Facture(Long idFacture, Date last_payed_month, double montent) {
		super();
		this.idFacture = idFacture;
		this.last_payed_month = last_payed_month;
		this.montent = montent;
		
	}

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public Date getLast_payed_month() {
		return last_payed_month;
	}

	public void setLast_payed_month(Date last_payed_month) {
		this.last_payed_month = last_payed_month;
	}

	public double getMontent() {
		return montent;
	}

	public void setMontent(double montent) {
		this.montent = montent;
	}



	@Override
	public String toString() {
		return "facture [idFacture=" + idFacture + ", last_payed_month=" + last_payed_month + ", montent=" + montent
				 + "]";
	}


}
