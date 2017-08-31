package fr.adaming.springbootangular.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ManyToMany;

@DiscriminatorValue(value = "entrepot")
public class Entrepot extends Batiment{

	private Long capacite;
	private List<Magasin> listMagasin;
	private List<Fournisseur> listFournisseur;
	
	public Entrepot() {
		
	}

	@Column(name="capacite")
	public Long getCapacite() {
		return capacite;
	}

	public void setCapacite(Long capacite) {
		this.capacite = capacite;
	}


	@ManyToMany
	public List<Magasin> getListMagasin() {
		return listMagasin;
	}


	public void setListMagasin(List<Magasin> listMagasin) {
		this.listMagasin = listMagasin;
	}


	@ManyToMany
	public List<Fournisseur> getListFournisseur() {
		return listFournisseur;
	}


	public void setListFournisseur(List<Fournisseur> listFournisseur) {
		this.listFournisseur = listFournisseur;
	}
	
	

}
