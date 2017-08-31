package fr.adaming.springbootangular.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Produit {
	
	private Long idProduit;
	private String nomProduit;
	private Long prixAchat;
	private Long prixVente;
	private String descriptif;
	private String marque;
	private List<Fournisseur> listFournisseur;
	private List<Categorie> listCategorie;
	private List<Stock> listStock;

	public Produit() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	@Column
	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	@Column
	public Long getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(Long prixAchat) {
		this.prixAchat = prixAchat;
	}

	@Column
	public Long getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(Long prixVente) {
		this.prixVente = prixVente;
	}

	@Column
	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	@Column
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@ManyToMany
	public List<Fournisseur> getListFournisseur() {
		return listFournisseur;
	}

	public void setListFournisseur(List<Fournisseur> listFournisseur) {
		this.listFournisseur = listFournisseur;
	}

	@ManyToMany
	public List<Categorie> getListCategorie() {
		return listCategorie;
	}

	public void setListCategorie(List<Categorie> listCategorie) {
		this.listCategorie = listCategorie;
	}

	@OneToMany (cascade = CascadeType.ALL)
	public List<Stock> getListStock() {
		return listStock;
	}

	public void setListStock(List<Stock> listStock) {
		this.listStock = listStock;
	}
	
	
	

}
