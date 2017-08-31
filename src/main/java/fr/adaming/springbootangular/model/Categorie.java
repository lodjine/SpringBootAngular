package fr.adaming.springbootangular.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Categorie {

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

	@ManyToMany
	public List<Produit> getListProduit() {
		return listProduit;
	}

	public void setListProduit(List<Produit> listProduit) {
		this.listProduit = listProduit;
	}

}
