package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IFournisseurDao;
import fr.adaming.springbootangular.model.Fournisseur;

@RestController
public class FournisseurWService {

	@Autowired
	private IFournisseurDao fournisseurDao;

	@RequestMapping(value = "/fournisseur", method = RequestMethod.POST)
	public Fournisseur saveFournisseur(@RequestBody Fournisseur fournisseur) {
		fournisseurDao.save(fournisseur);
		return fournisseur;
	}

	@RequestMapping(value = "/fournisseur", method = RequestMethod.PUT)
	public Fournisseur updateFournisseur(@RequestBody Fournisseur fournisseur) {
		fournisseurDao.save(fournisseur);
		return fournisseur;
	}

	
	@RequestMapping(value = "/fournisseur", method = RequestMethod.GET)
	public List<Fournisseur> getFournisseurs() {
		return fournisseurDao.findAll();
	}

	@RequestMapping(value = "/fournisseur/{id}", method = RequestMethod.GET)
	public Fournisseur getFournisseur(@PathVariable Long id) {
		return fournisseurDao.findOne(id);
	}

	@RequestMapping(value = "/fournisseur/{id}", method = RequestMethod.DELETE)
	public boolean deleteFournisseur(@PathVariable Long id) {
		fournisseurDao.delete(id);
		return true;
	}

}