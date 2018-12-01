package com.pfe.gestion.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Rapport {
	@Id
	@GeneratedValue
	private Long id;
	private String domaine;
	private String sujet;
	private String entreprise;
	private String rapport;
	@OneToOne
	private User user;
	public Rapport(String domaine, String sujet, String entreprise, String rapport,User user) {
		super();
		this.domaine = domaine;
		this.sujet = sujet;
		this.entreprise = entreprise;
		this.rapport = rapport;
		this.user = user;
	}
	public Rapport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public String getRapport() {
		return rapport;
	}
	public void setRapport(String rapport) {
		this.rapport = rapport;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
