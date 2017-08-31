package fr.adaming.springbootangular.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;

public class PrixAchat {

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

	@Column
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Column
	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

}
