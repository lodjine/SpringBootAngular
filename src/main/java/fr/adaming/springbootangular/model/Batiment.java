package fr.adaming.springbootangular.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Batiment {

	private Long idBatiment;
	private String adresse;
	private String nomBatiment;
	private String secteur;
	private String groupe;

	private List<User> listUser;
	private List<Stock> listStock;

	public Batiment() {
	}

	public Batiment(Long idBatiment, String adresse, String nomBatiment, String secteur, String groupe,
			List<User> listUser, List<Stock> listStock) {
		this.idBatiment = idBatiment;
		this.adresse = adresse;
		this.nomBatiment = nomBatiment;
		this.secteur = secteur;
		this.groupe = groupe;
		this.listUser = listUser;
		this.listStock = listStock;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdBatiment() {
		return idBatiment;
	}

	public void setIdBatiment(Long idBatiment) {
		this.idBatiment = idBatiment;
	}

	@Column
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column
	public String getNomBatiment() {
		return nomBatiment;
	}

	public void setNomBatiment(String nomBatiment) {
		this.nomBatiment = nomBatiment;
	}

	@Column
	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	@Column
	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	@OneToMany(mappedBy = "batiment")
	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	@OneToMany(mappedBy = "batiment")
	public List<Stock> getListStock() {
		return listStock;
	}

	public void setListStock(List<Stock> listStock) {
		this.listStock = listStock;
	}

	@Override
	public String toString() {
		return "Batiment [idBatiment=" + idBatiment + ", adresse=" + adresse + ", nomBatiment=" + nomBatiment
				+ ", secteur=" + secteur + ", groupe=" + groupe + ", listUser=" + listUser + ", listStock=" + listStock
				+ "]";
	}
	
	

}
