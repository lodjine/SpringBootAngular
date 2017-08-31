package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.ICategorieDao;
import fr.adaming.springbootangular.model.Categorie;

@RestController
public class CategorieWService {

	@Autowired
	private ICategorieDao categorieDao;

	@RequestMapping(value = "/categories", method = RequestMethod.POST)
	public Categorie saveCategorie(@RequestBody Categorie categorie) {
		categorieDao.save(categorie);
		return categorie;
	}

	@RequestMapping(value = "/categories", method = RequestMethod.PUT)
	public Categorie updateCategorie(@RequestBody Categorie categorie) {
		categorieDao.save(categorie);
		return categorie;
	}

	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public List<Categorie> getCategorie() {
		return categorieDao.findAll();
	}

	@RequestMapping(value = "/categories/{id}", method = RequestMethod.GET)
	public Categorie getStock(@PathVariable Long id) {
		return categorieDao.findOne(id);
	}

	@RequestMapping(value = "/categories/{id}", method = RequestMethod.GET)
	public boolean deleteCategorie(@PathVariable Long id) {
		categorieDao.delete(id);
		return true;
	}

}