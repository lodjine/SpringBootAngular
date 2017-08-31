package fr.adaming.springbootangular.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IProduitDao;
import fr.adaming.springbootangular.model.Produit;

@RestController
public class ProduitWService {
	
	@Autowired
	private IProduitDao produitDao;
	
	@RequestMapping(value="/produits", method=RequestMethod.POST)
	public Produit saveProduit(@RequestBody Produit produit){
		produitDao.save(produit);
		return produit;
	}
	
	@RequestMapping(value="/produits", method=RequestMethod.PUT)
	public Produit UpdateProduit(@RequestBody Produit produit){
		produitDao.save(produit);
		return produit;
	}

}
