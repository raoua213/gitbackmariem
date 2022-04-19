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
public class Presence_eleve {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPE;
	@Column(nullable = false)
	private boolean etat;
	//@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd-MM-yyyy")
	//@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date datePE;
	
	@ManyToOne
	private Eleve presence;
	
	public Presence_eleve() {
		super();
	}
	
	public Presence_eleve(Long idPE, boolean etat, Date datePE, Eleve presence) {
		super();
		this.idPE = idPE;
		this.etat = etat;
		this.datePE = datePE;
		this.presence = presence;
	}

	public Presence_eleve( Date datePE, boolean etat, Eleve presence) {
		super();
		this.etat = etat;
		this.datePE = datePE;
		this.presence = presence;
	}

	public Long getIdPE() {
		return idPE;
	}
	public void setIdPE(Long idPE) {
		this.idPE = idPE;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public Date getDatePE() {
		return datePE;
	}
	public void setDatePE(Date datePE) {
		this.datePE = datePE;
	}
	@Override
	public String toString() {
		return "presence_eleve [idPE=" + idPE + ", etat=" + etat + ", datePE=" + datePE + "]";
	}
	public Eleve getPresence() {
		return presence;
	}
	public void setPresence(Eleve presence) {
		this.presence = presence;
	}
	
	
}
