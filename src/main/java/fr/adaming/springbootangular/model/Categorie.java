package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Categorie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idCategorie;
	private String categorie;

	private List<Produit> listProduit;

	public Categorie() {
	}

	public Categorie(Long idCategorie, String categorie, List<Produit> listProduit) {
		this.idCategorie = idCategorie;
		this.categorie = categorie;
		this.listProduit = listProduit;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	@Column
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@ManyToMany(mappedBy="listCategorie")
	public List<Produit> getListProduit() {
		return listProduit;
	}

	public void setListProduit(List<Produit> listProduit) {
		this.listProduit = listProduit;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", categorie=" + categorie + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categorie == null) ? 0 : categorie.hashCode());
		result = prime * result + ((idCategorie == null) ? 0 : idCategorie.hashCode());
		result = prime * result + ((listProduit == null) ? 0 : listProduit.hashCode());
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
		Categorie other = (Categorie) obj;
		if (categorie == null) {
			if (other.categorie != null)
				return false;
		} else if (!categorie.equals(other.categorie))
			return false;
		if (idCategorie == null) {
			if (other.idCategorie != null)
				return false;
		} else if (!idCategorie.equals(other.idCategorie))
			return false;
		if (listProduit == null) {
			if (other.listProduit != null)
				return false;
		} else if (!listProduit.equals(other.listProduit))
			return false;
		return true;
	}

	
}
