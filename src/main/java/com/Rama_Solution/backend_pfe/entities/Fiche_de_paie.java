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
public class Fiche_de_paie {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idFDP;
	@Column(nullable = false)
	private double salaire_brut;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dateF;
	private double impot;
	private String cnss;
	
	@ManyToOne
	private Personnel fiche;
	
	public Fiche_de_paie() {
		super();
	}
	public Fiche_de_paie(Long idFDP, double salaire_brut, Date dateF, double impot, String cnss) {
		super();
		this.idFDP = idFDP;
		this.salaire_brut = salaire_brut;
		this.dateF = dateF;
		this.impot = impot;
		this.cnss = cnss;
	}
	public Long getIdFDP() {
		return idFDP;
	}
	public void setIdFDP(Long idFDP) {
		this.idFDP = idFDP;
	}
	public double getSalaire_brut() {
		return salaire_brut;
	}
	public void setSalaire_brut(double salaire_brut) {
		this.salaire_brut = salaire_brut;
	}
	public Date getDateF() {
		return dateF;
	}
	public void setDate(Date dateF) {
		this.dateF = dateF;
	}
	public double getImpot() {
		return impot;
	}
	public void setImpot(double impot) {
		this.impot = impot;
	}
	public String getCnss() {
		return cnss;
	}
	public void setCnss(String cnss) {
		this.cnss = cnss;
	}
	@Override
	public String toString() {
		return "fiche_de_paie [idFDP=" + idFDP + ", salaire_brut=" + salaire_brut + ", dateF=" + dateF + ", impot="
				+ impot + ", cnss=" + cnss + "]";
	}
	
	

}
