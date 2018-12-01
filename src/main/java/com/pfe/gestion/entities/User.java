package com.pfe.gestion.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String prenom;
	private String nom;
	private String email;
	private String filiere;
	private String option;
	private int tel;
	private String apropos;
	@OneToOne(mappedBy="user")
	private Rapport rapport;
	
	public Rapport getRapport() {
		return rapport;
	}
	public void setRapport(Rapport rapport) {
		this.rapport = rapport;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getApropos() {
		return apropos;
	}
	public void setApropos(String apropos) {
		this.apropos = apropos;
	}
	public User(String prenom, String nom, String email, String filiere, String option, int tel, String apropos) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.filiere = filiere;
		this.option = option;
		this.tel = tel;
		this.apropos = apropos;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
