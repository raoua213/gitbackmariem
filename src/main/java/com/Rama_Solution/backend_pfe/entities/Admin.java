package com.Rama_Solution.backend_pfe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Admin {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idAdmin;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String pass;
	
	
	
	public Admin() {
		super();
	}
	public Admin(Long idAdmin, String name, String pass) {
		super();
		this.idAdmin = idAdmin;
		this.name = name;
		this.pass = pass;
	}
	
	public Long getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "admin [name=" + name + ", pass=" + pass + "]";
	}
	
	
}