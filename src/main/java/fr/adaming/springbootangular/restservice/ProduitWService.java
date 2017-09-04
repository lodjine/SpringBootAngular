package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/produit", method=RequestMethod.POST)
	public Produit saveProduit(@RequestBody Produit produit){
		produitDao.save(produit);
		return produit;
	}
	
	@RequestMapping(value="/produit", method=RequestMethod.PUT)
	public Produit updateProduit(@RequestBody Produit produit){
		produitDao.save(produit);
		return produit;
	}
	
	@RequestMapping(value="/produit", method=RequestMethod.GET)
	public List<Produit> getProduits(){
		return produitDao.findAll();
	}
	
	@RequestMapping(value="/produit/{id}", method=RequestMethod.GET)	
	public Produit getProduit(@PathVariable Long id){
		return produitDao.findOne(id);
	}
	
	@RequestMapping(value="/produit/{id}", method=RequestMethod.DELETE)
	public boolean deleteProduit(@PathVariable Long id){
		produitDao.delete(id);
		return true;
	}

}
