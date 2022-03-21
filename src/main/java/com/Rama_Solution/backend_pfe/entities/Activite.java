package com.Rama_Solution.backend_pfe.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Activite {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idActivite;
	@Column(nullable = false)
	private String nom_activite;
	private String type;
	@Column(nullable = false)
	private Date date_act;
	@Column(nullable = false)
	private String horaire_act;
	
	@OneToMany (mappedBy = "fk_evaluation2")
	private List<Evaluation> fk_evaluation2;
	
	@OneToMany (mappedBy = "fk_emploi")
	private List<Emploi> fk_emploi;
	
	
	public List<Evaluation> getFk_evaluation2() {
		return fk_evaluation2;
	}

	public void setFk_evaluation2(List<Evaluation> fk_evaluation2) {
		this.fk_evaluation2 = fk_evaluation2;
	}

	public List<Emploi> getFk_emploi() {
		return fk_emploi;
	}

	public void setFk_emploi(List<Emploi> fk_emploi) {
		this.fk_emploi = fk_emploi;
	}

	public Activite() {
		super();
	}

	public Activite(String nom_activite, String type, Date date_act, String horaire_act) {
		super();
		this.nom_activite = nom_activite;
		this.type = type;
		this.date_act = date_act;
		this.horaire_act = horaire_act;
	}

	
	public Long getIdActivite() {
		return idActivite;
	}

	public void setIdActivite(Long idActivite) {
		this.idActivite = idActivite;
	}

	public String getNom_activite() {
		return nom_activite;
	}
	public void setNom_activite(String nom_activite) {
		this.nom_activite = nom_activite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate_act() {
		return date_act;
	}
	public void setDate_act(Date date_act) {
		this.date_act = date_act;
	}
	public String getHoraire_act() {
		return horaire_act;
	}
	public void setHoraire_act(String horaire_act) {
		this.horaire_act = horaire_act;
	}
	@Override
	public String toString() {
		return "activite [nom_activite=" + nom_activite + ", type=" + type + ", date_act=" + date_act + ", horaire_act="
				+ horaire_act + "]";
	}
	
	
}
