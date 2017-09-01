package fr.adaming.springbootangular.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class PrixAchat implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IdPrixAchat idPrixAchat;
	private String prixAchat;
	private Produit produit;
	private Fournisseur fournisseur;

	public PrixAchat(String prixAchat, Produit produit, Fournisseur fournisseur) {
		super();
		this.prixAchat = prixAchat;
		this.produit = produit;
		this.fournisseur = fournisseur;
	}

	public PrixAchat() {
		super();
	}

	@EmbeddedId
	public IdPrixAchat getIdPrixAchat() {
		return idPrixAchat;
	}

	public void setIdPrixAchat(IdPrixAchat idPrixAchat) {
		this.idPrixAchat = idPrixAchat;
	}

	@Column
	public String getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(String prixAchat) {
		this.prixAchat = prixAchat;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	@Override
	public String toString() {
		return "PrixAchat [" + (idPrixAchat != null ? "idPrixAchat=" + idPrixAchat + ", " : "")
				+ (prixAchat != null ? "prixAchat=" + prixAchat : "") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fournisseur == null) ? 0 : fournisseur.hashCode());
		result = prime * result + ((idPrixAchat == null) ? 0 : idPrixAchat.hashCode());
		result = prime * result + ((prixAchat == null) ? 0 : prixAchat.hashCode());
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
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
		PrixAchat other = (PrixAchat) obj;
		if (fournisseur == null) {
			if (other.fournisseur != null)
				return false;
		} else if (!fournisseur.equals(other.fournisseur))
			return false;
		if (idPrixAchat == null) {
			if (other.idPrixAchat != null)
				return false;
		} else if (!idPrixAchat.equals(other.idPrixAchat))
			return false;
		if (prixAchat == null) {
			if (other.prixAchat != null)
				return false;
		} else if (!prixAchat.equals(other.prixAchat))
			return false;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		return true;
	}

}
