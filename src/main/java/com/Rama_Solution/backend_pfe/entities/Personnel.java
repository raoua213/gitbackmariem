package com.Rama_Solution.backend_pfe.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Personnel {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPersonnel;
	@Column(nullable = false)
	private String cin;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	private String mail;
	@Column(nullable = false)
	private String tel;
	@Column(nullable = false)
	private String fonction;
	private double salaire_de_base;
	private int nb_jour_initiale;
	private int nb_jour_taken;
	
	
	@OneToMany (mappedBy = "fiche")
	private List<Fiche_de_paie> fiches;
	
	@OneToMany (mappedBy = "fk_emploi2")
	private List<Emploi> fk_emploi2;
	
	@OneToMany (mappedBy = "presence")
	private List<Presence_personnel> presences;
	
	@OneToMany (mappedBy = "conges")
	private List<Conges> conges;
	
	public List<Emploi> getFk_emploi2() {
		return fk_emploi2;
	}

	public List<Conges> getConges() {
		return conges;
	}

	public void setConges(List<Conges> conges) {
		this.conges = conges;
	}

	public void setFk_emploi2(List<Emploi> fk_emploi2) {
		this.fk_emploi2 = fk_emploi2;
	}

	public List<Fiche_de_paie> getFiches() {
		return fiches;
	}

	public void setFiches(List<Fiche_de_paie> fiches) {
		this.fiches = fiches;
	}

	
	public List<Presence_personnel> getPresences() {
		return presences;
	}

	public void setPresences(List<Presence_personnel> presences) {
		this.presences = presences;
	}

	public Personnel() {
		super();
	}

	public Personnel(String cin, String nom, String prenom, String mail, String tel, String fonction,
			int salaire_de_base, int nb_jour_initiale, int nb_jour_taken) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.fonction = fonction;
		this.salaire_de_base = salaire_de_base;
		this.nb_jour_initiale = nb_jour_initiale;
		this.nb_jour_taken = nb_jour_taken;
		
	}

	public Long getIdPersonnel() {
		return idPersonnel;
	}

	public void setIdPersonnel(Long idPersonnel) {
		this.idPersonnel = idPersonnel;
	}



	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public double getSalaire_de_base() {
		return salaire_de_base;
	}

	public void setSalaire_de_base(double salaire_de_base) {
		this.salaire_de_base = salaire_de_base;
	}

	public int getNb_jour_initiale() {
		return nb_jour_initiale;
	}

	public void setNb_jour_initiale(int nb_jour_initiale) {
		this.nb_jour_initiale = nb_jour_initiale;
	}

	public int getNb_jour_taken() {
		return nb_jour_taken;
	}

	public void setNb_jour_taken(int nb_jour_taken) {
		this.nb_jour_taken = nb_jour_taken;
	}


	@Override
	public String toString() {
		return "personnel [idPersonnel=" + idPersonnel + ", cin=" + cin + ", nom=" + nom + ", prenom=" + prenom
				+ ", mail=" + mail + ", tel=" + tel + ", fonction=" + fonction + ", salaire_de_base=" + salaire_de_base
				+ ", nb_jour_initiale=" + nb_jour_initiale + ", nb_jour_taken=" + nb_jour_taken + "]";
	}

	
	

}
