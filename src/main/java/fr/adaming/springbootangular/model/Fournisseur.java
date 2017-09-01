package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur implements Serializable{

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

	@Override
	public String toString() {
		return "Fournisseur [idFournisseur=" + idFournisseur + ", nomEntreprise=" + nomEntreprise + ", nomResponsable="
				+ nomResponsable + ", mail=" + mail + ", numTel=" + numTel + ", adresse=" + adresse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((idFournisseur == null) ? 0 : idFournisseur.hashCode());
		result = prime * result + ((listEntrepot == null) ? 0 : listEntrepot.hashCode());
		result = prime * result + ((listPrixAchat == null) ? 0 : listPrixAchat.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((nomEntreprise == null) ? 0 : nomEntreprise.hashCode());
		result = prime * result + ((nomResponsable == null) ? 0 : nomResponsable.hashCode());
		result = prime * result + ((numTel == null) ? 0 : numTel.hashCode());
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
		Fournisseur other = (Fournisseur) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (idFournisseur == null) {
			if (other.idFournisseur != null)
				return false;
		} else if (!idFournisseur.equals(other.idFournisseur))
			return false;
		if (listEntrepot == null) {
			if (other.listEntrepot != null)
				return false;
		} else if (!listEntrepot.equals(other.listEntrepot))
			return false;
		if (listPrixAchat == null) {
			if (other.listPrixAchat != null)
				return false;
		} else if (!listPrixAchat.equals(other.listPrixAchat))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (nomEntreprise == null) {
			if (other.nomEntreprise != null)
				return false;
		} else if (!nomEntreprise.equals(other.nomEntreprise))
			return false;
		if (nomResponsable == null) {
			if (other.nomResponsable != null)
				return false;
		} else if (!nomResponsable.equals(other.nomResponsable))
			return false;
		if (numTel == null) {
			if (other.numTel != null)
				return false;
		} else if (!numTel.equals(other.numTel))
			return false;
		return true;
	}
	

}
