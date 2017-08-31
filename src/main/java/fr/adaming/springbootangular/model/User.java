package fr.adaming.springbootangular.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class User {
	
	private Long idUser;
	private String nom;
	private String prenom;
	private String pseudo;
	private String password;
	
	private List<Profil> listProfil;
	private Batiment batiment;

	public User() {
		this.listProfil = new ArrayList<Profil>();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	@Column
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	@Column
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToMany
	public List<Profil> getListProfil() {
		return listProfil;
	}
	public void setListProfil(List<Profil> listProfil) {
		this.listProfil = listProfil;
	}

	@ManyToOne
	public Batiment getBatiment() {
		return batiment;
	}
	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}

	
}
