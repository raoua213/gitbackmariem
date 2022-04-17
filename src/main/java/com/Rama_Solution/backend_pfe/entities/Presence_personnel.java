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
public class Presence_personnel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPP;
	@Column(nullable = false)
	private boolean etat;
	@Column(nullable = false)
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date date;

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

	public Presence_personnel(Long idPP, boolean etat, Date date) {
		super();
		this.idPP = idPP;
		this.etat = etat;
		this.date = date;
		
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


	@Override
	public String toString() {
		return "Presence_personnel [idPP=" + idPP + ", etat=" + etat + ", date=" + date +  ", presence=" + presence + "]";
	}

}
