package fr.adaming.springbootangular.model;

import java.io.Serializable;
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
public class Produit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idProduit;
	private String nomProduit;
	private Long prixVente;
	private String descriptif;
	private String marque;
	private List<PrixAchat> listPrixAchat;
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

	@OneToMany (mappedBy="produit", cascade = CascadeType.ALL)
	public List<PrixAchat> getListPrixAchat() {
		return listPrixAchat;
	}

	public void setListPrixAchat(List<PrixAchat> listPrixAchat) {
		this.listPrixAchat = listPrixAchat;
	}

	@ManyToMany
	public List<Categorie> getListCategorie() {
		return listCategorie;
	}

	public void setListCategorie(List<Categorie> listCategorie) {
		this.listCategorie = listCategorie;
	}

	@OneToMany (mappedBy="produit", cascade = CascadeType.ALL)
	public List<Stock> getListStock() {
		return listStock;
	}

	public void setListStock(List<Stock> listStock) {
		this.listStock = listStock;
	}

	@Override
	public String toString() {
		return "Produit [" + (idProduit != null ? "idProduit=" + idProduit + ", " : "")
				+ (nomProduit != null ? "nomProduit=" + nomProduit + ", " : "")
				+ (prixVente != null ? "prixVente=" + prixVente + ", " : "")
				+ (descriptif != null ? "descriptif=" + descriptif + ", " : "")
				+ (marque != null ? "marque=" + marque : "") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descriptif == null) ? 0 : descriptif.hashCode());
		result = prime * result + ((idProduit == null) ? 0 : idProduit.hashCode());
		result = prime * result + ((listCategorie == null) ? 0 : listCategorie.hashCode());
		result = prime * result + ((listPrixAchat == null) ? 0 : listPrixAchat.hashCode());
		result = prime * result + ((listStock == null) ? 0 : listStock.hashCode());
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		result = prime * result + ((nomProduit == null) ? 0 : nomProduit.hashCode());
		result = prime * result + ((prixVente == null) ? 0 : prixVente.hashCode());
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
		Produit other = (Produit) obj;
		if (descriptif == null) {
			if (other.descriptif != null)
				return false;
		} else if (!descriptif.equals(other.descriptif))
			return false;
		if (idProduit == null) {
			if (other.idProduit != null)
				return false;
		} else if (!idProduit.equals(other.idProduit))
			return false;
		if (listCategorie == null) {
			if (other.listCategorie != null)
				return false;
		} else if (!listCategorie.equals(other.listCategorie))
			return false;
		if (listPrixAchat == null) {
			if (other.listPrixAchat != null)
				return false;
		} else if (!listPrixAchat.equals(other.listPrixAchat))
			return false;
		if (listStock == null) {
			if (other.listStock != null)
				return false;
		} else if (!listStock.equals(other.listStock))
			return false;
		if (marque == null) {
			if (other.marque != null)
				return false;
		} else if (!marque.equals(other.marque))
			return false;
		if (nomProduit == null) {
			if (other.nomProduit != null)
				return false;
		} else if (!nomProduit.equals(other.nomProduit))
			return false;
		if (prixVente == null) {
			if (other.prixVente != null)
				return false;
		} else if (!prixVente.equals(other.prixVente))
			return false;
		return true;
	}

}
