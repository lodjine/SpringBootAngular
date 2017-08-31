package fr.adaming.springbootangular.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur {

	private Long idFournisseur;
	private String nomEntreprise;
	private String nomResponsable;
	private String mail;
	private String numTel;
	private String adresse;
	private List<Entrepot> listEntrepot;
	private List<PrixAchat> listPrixAchat;
	
	public Fournisseur() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	@Column(name="nom_entreprise")
	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	@Column(name="nom_responsable")
	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}

	@Column(name="mail")
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name="num_tel")
	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	@Column(name="adresse")
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@ManyToMany(mappedBy="listFournisseur")
	public List<Entrepot> getListEntrepot() {
		return listEntrepot;
	}

	public void setListEntrepot(List<Entrepot> listEntrepot) {
		this.listEntrepot = listEntrepot;
	}

	@OneToMany(mappedBy="fournisseur")
	public List<PrixAchat> getListPrixAchat() {
		return listPrixAchat;
	}

	public void setListPrixAchat(List<PrixAchat> listPrixAchat) {
		this.listPrixAchat = listPrixAchat;
	}
	

}
