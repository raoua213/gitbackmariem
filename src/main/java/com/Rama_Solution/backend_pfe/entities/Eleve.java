package com.Rama_Solution.backend_pfe.entities;


import java.sql.Blob;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Eleve {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEleve;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date_nais;
	private String genre;
	private String taille;
	private String poid;
	@Column(nullable = false)
	private String vaccination;
	private String maladies;
	private String médicament;
	@Column(nullable = false)
	private String nom_parent;
	@Column(nullable = false)
	private String tel_parent;
	@Column(nullable = false)
	private String email_parent;
	private String adresse;
	private Blob img;
	
	@OneToMany (mappedBy = "fk_evaluation")
	private List<Evaluation> fk_evaluation;
	
	@OneToMany (mappedBy = "presence")
	private List<Presence_eleve> presences;
	
	@ManyToOne
	private Classe eleves;
	
	@OneToMany (mappedBy = "factures")
	private List<Facture> factures;
	
	public List<Evaluation> getFk_evaluation() {
		return fk_evaluation;
	}
	public void setFk_evaluation(List<Evaluation> fk_evaluation) {
		this.fk_evaluation = fk_evaluation;
	}
	public Classe getEleves() {
		return eleves;
	}
	public void setEleves(Classe eleves) {
		this.eleves = eleves;
	}
	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	
	public Eleve() {
		super();
	}
	
	public Eleve(Long idEleve, String nom, String prenom, Date date_nais, String genre, String taille, String poid,
			String vaccination, String maladies, String médicament, String nom_parent, String tel_parent,
			String email_parent, String adresse, Blob img, List<Evaluation> fk_evaluation,
			List<Presence_eleve> presences, Classe eleves, List<Facture> factures) {
		super();
		this.idEleve = idEleve;
		this.nom = nom;
		this.prenom = prenom;
		this.date_nais = date_nais;
		this.genre = genre;
		this.taille = taille;
		this.poid = poid;
		this.vaccination = vaccination;
		this.maladies = maladies;
		this.médicament = médicament;
		this.nom_parent = nom_parent;
		this.tel_parent = tel_parent;
		this.email_parent = email_parent;
		this.adresse = adresse;
		this.img = img;
		this.fk_evaluation = fk_evaluation;
		this.presences = presences;
		this.eleves = eleves;
		this.factures = factures;
	}
	public Long getIdEleve() {
		return idEleve;
	}
	public void setIdEleve(Long idEleve) {
		this.idEleve = idEleve;
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
	public Date getDate_nais() {
		return date_nais;
	}
	public void setDate_nais(Date date_nais) {
		this.date_nais = date_nais;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public String getPoid() {
		return poid;
	}
	public void setPoid(String poid) {
		this.poid = poid;
	}
	public String getVaccination() {
		return vaccination;
	}
	public void setVaccination(String vaccination) {
		this.vaccination = vaccination;
	}
	public String getMaladies() {
		return maladies;
	}
	public void setMaladies(String maladies) {
		this.maladies = maladies;
	}
	public String getMédicament() {
		return médicament;
	}
	public void setMédicament(String médicament) {
		this.médicament = médicament;
	}
	public String getNom_parent() {
		return nom_parent;
	}
	public void setNom_parent(String nom_parent) {
		this.nom_parent = nom_parent;
	}
	
	public String getTel_parent() {
		return tel_parent;
	}
	public void setTel_parent(String tel_parent) {
		this.tel_parent = tel_parent;
	}
	public String getEmail_parent() {
		return email_parent;
	}
	public void setEmail_parent(String email_parent) {
		this.email_parent = email_parent;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Blob getImg() {
		return img;
	}
	public void setImg(Blob img) {
		this.img = img;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((date_nais == null) ? 0 : date_nais.hashCode());
		result = prime * result + ((email_parent == null) ? 0 : email_parent.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((maladies == null) ? 0 : maladies.hashCode());
		result = prime * result + ((médicament == null) ? 0 : médicament.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((nom_parent == null) ? 0 : nom_parent.hashCode());
		result = prime * result + ((poid == null) ? 0 : poid.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((taille == null) ? 0 : taille.hashCode());
		result = prime * result + ((tel_parent == null) ? 0 : tel_parent.hashCode());
		result = prime * result + ((vaccination == null) ? 0 : vaccination.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eleve other = (Eleve) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (date_nais == null) {
			if (other.date_nais != null)
				return false;
		} else if (!date_nais.equals(other.date_nais))
			return false;
		if (email_parent == null) {
			if (other.email_parent != null)
				return false;
		} else if (!email_parent.equals(other.email_parent))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (maladies == null) {
			if (other.maladies != null)
				return false;
		} else if (!maladies.equals(other.maladies))
			return false;
		if (médicament == null) {
			if (other.médicament != null)
				return false;
		} else if (!médicament.equals(other.médicament))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (nom_parent == null) {
			if (other.nom_parent != null)
				return false;
		} else if (!nom_parent.equals(other.nom_parent))
			return false;
		if (poid == null) {
			if (other.poid != null)
				return false;
		} else if (!poid.equals(other.poid))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (taille == null) {
			if (other.taille != null)
				return false;
		} else if (!taille.equals(other.taille))
			return false;
		if (tel_parent == null) {
			if (other.tel_parent != null)
				return false;
		} else if (!tel_parent.equals(other.tel_parent))
			return false;
		if (vaccination == null) {
			if (other.vaccination != null)
				return false;
		} else if (!vaccination.equals(other.vaccination))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "eleve [idEleve=" + idEleve + ", Nom=" + nom + ", prenom=" + prenom + ", date_nais=" + date_nais
				+ ", genre=" + genre + ", taille=" + taille + ", poid=" + poid + ", vaccination=" + vaccination
				+ ", maladies=" + maladies + ", médicament=" + médicament + ", nom_parent=" + nom_parent
				+ ", Tel_parent=" + tel_parent + ", Email_parent=" + email_parent + ", adresse=" + adresse + "]";
	}
	public List<Presence_eleve> getPresences() {
		return presences;
	}
	public void setPresences(List<Presence_eleve> presences) {
		this.presences = presences;
	}
	

	
}
