package com.Rama_Solution.backend_pfe.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Emploi {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEmploi;
	@Column(nullable = false)
	private Date date_emp;
	@Column(nullable = false)
	private String salle;
	
	@ManyToOne
	private Personnel fk_emploi2;
	
	@ManyToOne
	private Activite fk_emploi;
	
	
	public Personnel getFk_emploi2() {
		return fk_emploi2;
	}
	public void setFk_emploi2(Personnel fk_emploi2) {
		this.fk_emploi2 = fk_emploi2;
	}
	public Activite getFk_emploi() {
		return fk_emploi;
	}
	public void setFk_emploi(Activite fk_emploi) {
		this.fk_emploi = fk_emploi;
	}
	public Emploi() {
		super();
	}
	public Emploi(Long idEmploi, Date date_emp, String salle) {
		super();
		this.idEmploi = idEmploi;
		this.date_emp = date_emp;
		this.salle = salle;
	}
	public Long getIdEmploi() {
		return idEmploi;
	}
	public void setIdEmploi(Long idEmploi) {
		this.idEmploi = idEmploi;
	}
	public Date getDate_emp() {
		return date_emp;
	}
	public void setDate_emp(Date date_emp) {
		this.date_emp = date_emp;
	}
	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	@Override
	public String toString() {
		return "emploi [idEmploi=" + idEmploi + ", date_emp=" + date_emp + ", salle=" + salle + "]";
	}
	
	
}
