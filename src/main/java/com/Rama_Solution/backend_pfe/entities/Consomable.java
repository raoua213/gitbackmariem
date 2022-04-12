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
public class Consomable {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idConsomable;
	@Column(nullable = false)
	private double quantite_consome;
	@Column(nullable = false)
	private Date date;
	
	
	@OneToMany (mappedBy = "fk_Art")
	private List<Article> fk_Art;
	
	
	public List<Article> getFk_Art() {
		return fk_Art;
	}
	public void setFk_Art(List<Article> fk_Art) {
		this.fk_Art = fk_Art;
	}
	public Consomable() {
		super();
	}
	public Consomable(Long idConsomable, double quantite_consome, Date date) {
		super();
		this.idConsomable = idConsomable;
		this.quantite_consome = quantite_consome;
		this.date = date;
	}
	public Long getIdConsomable() {
		return idConsomable;
	}
	public void setIdConsomable(Long idConsomable) {
		this.idConsomable = idConsomable;
	}
	public double getQuantite_consome() {
		return quantite_consome;
	}
	public void setQuantite_consome(double quantite_consome) {
		this.quantite_consome = quantite_consome;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "consomable [idConsomable=" + idConsomable + ", quantite_consome=" + quantite_consome + ", date=" + date
				+ "]";
	}
	
	
}
