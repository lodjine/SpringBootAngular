package fr.adaming.springbootangular.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue(value = "Magasin")
public class Magasin extends Batiment {
	
	private List<Entrepot> listEntrepot = new ArrayList<>();
	

	public Magasin() {
		super();
	}


	public Magasin(List<Entrepot> listEntrepot) {
		super();
		this.listEntrepot = listEntrepot;
	}

	
	@ManyToMany(mappedBy="listMagasin")
	public List<Entrepot> getListEntrepot() {
		return listEntrepot;
	}


	public void setListEntrepot(List<Entrepot> listEntrepot) {
		this.listEntrepot = listEntrepot;
	}

	
	
	
}
