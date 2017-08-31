package fr.adaming.springbootangular.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;


@Entity
public class Stock {
	
	private IdStock idStock;

	private float quantite;
	private String unite;
	private float seuil;
	
	private Produit produit;
	private Batiment batiment;
	
	public Stock() {
	}
	
	
	@EmbeddedId
	public IdStock getIdStock() {
		return idStock;
	}
	public void setIdStock(IdStock idStock) {
		this.idStock = idStock;
	}
	
	@Column
	public float getQuantite() {
		return quantite;
	}
	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}
	
	@Column
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	
	@Column
	public float getSeuil() {
		return seuil;
	}
	public void setSeuil(float seuil) {
		this.seuil = seuil;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	public Batiment getBatiment() {
		return batiment;
	}
	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}
	
}
