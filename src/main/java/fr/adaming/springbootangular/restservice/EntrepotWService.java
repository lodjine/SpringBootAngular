package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IEntrepotDao;
import fr.adaming.springbootangular.model.Entrepot;

@RestController
public class EntrepotWService {

	@Autowired
	private IEntrepotDao entrepotDao;

	@RequestMapping(value = "/entrepots", method = RequestMethod.POST)
	public Entrepot saveEntrepot(@RequestBody Entrepot entrepot) {
		entrepotDao.save(entrepot);
		return entrepot;
	}

	@RequestMapping(value = "/entrepots", method = RequestMethod.PUT)
	public Entrepot updateEntrepot(@RequestBody Entrepot entrepot) {
		entrepotDao.save(entrepot);
		return entrepot;
	}

	@RequestMapping(value = "/entrepots", method = RequestMethod.GET)
	public List<Entrepot> getEntrepots() {
		return entrepotDao.findAll();
	}

	@RequestMapping(value = "/entrepots/{id}", method = RequestMethod.GET)
	public Entrepot getEntrepot(@PathVariable Long id) {
		return entrepotDao.findOne(id);
	}

	@RequestMapping(value = "/entrepots/{id}", method = RequestMethod.DELETE)
	public boolean deleteEntrepot(@PathVariable Long id) {
		entrepotDao.delete(id);
		return true;
	}

}
