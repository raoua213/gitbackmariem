package com.Rama_Solution.backend_pfe.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
public class Evaluation {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEvaluation;
	@Column(nullable = false)
	private double note;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String remarque;
	
	@ManyToOne
	private Eleve fk_evaluation;
	
	@ManyToOne
	private Activite fk_evaluation2;
	
	public Eleve getFk_evaluation() {
		return fk_evaluation;
	}

	public void setFk_evaluation(Eleve fk_evaluation) {
		this.fk_evaluation = fk_evaluation;
	}

	public Activite getFk_evaluation2() {
		return fk_evaluation2;
	}

	public void setFk_evaluation2(Activite fk_evaluation2) {
		this.fk_evaluation2 = fk_evaluation2;
	}

	public Evaluation() {
		super();
	}
	
	public Long getIdEvaluation() {
		return idEvaluation;
	}

	public void setIdEvaluation(Long idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public Evaluation(double note, Date date, String remarque) {
		super();
		this.note = note;
		this.date = date;
		this.remarque = remarque;
	}

	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	@Override
	public String toString() {
		return "evaluation [idEvaluation=" + idEvaluation + ", note=" + note + ", date=" + date + ", remarque=" + remarque + "]";
	}
	
	

}
