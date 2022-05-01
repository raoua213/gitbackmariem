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
public class Conges {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idConges;
	@Column(nullable = false)
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dateC;
	
	
	@ManyToOne
	private Personnel presence;
	
	public Long getIdConges() {
		return idConges;
	}
	public void setIdConges(Long idConges) {
		this.idConges = idConges;
	}
	public Date getDateC() {
		return dateC;
	}
	public void setDateC(Date dateC) {
		this.dateC = dateC;
	}	
	
	public Personnel getPresence() {
		return presence;
	}
	public void setPresence(Personnel presence) {
		this.presence = presence;
	}
	public Conges(Long idConges, Date dateC) {
		super();
		this.idConges = idConges;
		this.dateC = dateC;
	}
	public Conges() {
		super();
	}
	@Override
	public String toString() {
		return "Conges [idConges=" + idConges + ", dateC=" + dateC + "]";
	}
	
	
	

}
