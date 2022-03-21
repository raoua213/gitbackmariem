package com.Rama_Solution.backend_pfe.entities;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
public class Presence_personnel {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPP;
	@Column(nullable = false)
	private boolean etat;
	@Column(nullable = false)
	private Date date;
	private Blob justif;
	
	@ManyToOne
	private Personnel presence;
	

	public Personnel getPresence() {
		return presence;
	}

	public void setPresence(Personnel presence) {
		this.presence = presence;
	}

	public Presence_personnel() {
		super();
	}

	public Presence_personnel(Long idPP, boolean etat, Date date, Blob justif) {
		super();
		this.idPP = idPP;
		this.etat = etat;
		this.date = date;
		this.justif = justif;
	}

	public Long getIdPP() {
		return idPP;
	}

	public void setIdPP(Long idPP) {
		this.idPP = idPP;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Blob getJustif() {
		return justif;
	}

	public void setJustif(Blob justif) {
		this.justif = justif;
	}

	@Override
	public String toString() {
		return "Presence_personnel [idPP=" + idPP + ", etat=" + etat + ", date=" + date + ", justif=" + justif
				+ ", presence=" + presence + "]";
	}

	
	
}
