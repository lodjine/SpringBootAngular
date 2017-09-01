package fr.adaming.springbootangular.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import java.io.Serializable;

import javax.persistence.CascadeType;


@Entity
public class Stock implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IdStock idStock;

	private float quantite;
	private String unite;
	private float seuil;
	
	private Produit produit;
	private Batiment batiment;
	
	public Stock() {
		IdStock idS = new IdStock(produit.getIdProduit(), batiment.getIdBatiment());
		this.idStock = idS;
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


	@Override
	public String toString() {
		return "Stock [" + (idStock != null ? "idStock=" + idStock + ", " : "") + "quantite=" + quantite + ", "
				+ (unite != null ? "unite=" + unite + ", " : "") + "seuil=" + seuil + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batiment == null) ? 0 : batiment.hashCode());
		result = prime * result + ((idStock == null) ? 0 : idStock.hashCode());
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		result = prime * result + Float.floatToIntBits(quantite);
		result = prime * result + Float.floatToIntBits(seuil);
		result = prime * result + ((unite == null) ? 0 : unite.hashCode());
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
		Stock other = (Stock) obj;
		if (batiment == null) {
			if (other.batiment != null)
				return false;
		} else if (!batiment.equals(other.batiment))
			return false;
		if (idStock == null) {
			if (other.idStock != null)
				return false;
		} else if (!idStock.equals(other.idStock))
			return false;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		if (Float.floatToIntBits(quantite) != Float.floatToIntBits(other.quantite))
			return false;
		if (Float.floatToIntBits(seuil) != Float.floatToIntBits(other.seuil))
			return false;
		if (unite == null) {
			if (other.unite != null)
				return false;
		} else if (!unite.equals(other.unite))
			return false;
		return true;
	}
		
}
