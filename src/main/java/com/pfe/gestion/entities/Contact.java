package com.pfe.gestion.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue
	private Long id;
	private String nomComplet;
	private String entreprise;
	private String poste;
	private String email;
	private Long tel;
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String nomComplet, String entreprise, String poste, String email, Long tel) {
		super();
		this.nomComplet = nomComplet;
		this.entreprise = entreprise;
		this.poste = poste;
		this.email = email;
		this.tel = tel;
	}
	
	

}
