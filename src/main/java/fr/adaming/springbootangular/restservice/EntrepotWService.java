package fr.adaming.springbootangular.restservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IBatimentDao;
import fr.adaming.springbootangular.model.Batiment;
import fr.adaming.springbootangular.model.Entrepot;


@RestController
public class EntrepotWService {

	@Autowired
	private IBatimentDao entrepotDao;

	@RequestMapping(value = "/entrepot", method = RequestMethod.POST)
	public Entrepot saveEntrepot(@RequestBody Entrepot entrepot) {
		entrepotDao.save(entrepot);
		return entrepot;
	}

	@RequestMapping(value = "/entrepot", method = RequestMethod.PUT)
	public Entrepot updateEntrepot(@RequestBody Entrepot entrepot) {
		entrepotDao.save(entrepot);
		return entrepot;
	}

	@RequestMapping(value = "/entrepot", method = RequestMethod.GET)
	public List<Entrepot> getEntrepots() {
		List<Batiment> list = entrepotDao.findAll();
		List<Entrepot> lM = new ArrayList<>();
		for (Batiment b: list){
			lM.add((Entrepot) b);
		}
		return lM;
	}

	@RequestMapping(value = "/entrepot/{id}", method = RequestMethod.GET)
	public Entrepot getEntrepot(@PathVariable Long id) {
		return (Entrepot) entrepotDao.findOne(id);
	}

	@RequestMapping(value = "/entrepot/{id}", method = RequestMethod.DELETE)
	public boolean deleteEntrepot(@PathVariable Long id) {
		entrepotDao.delete(id);
		return true;
	}

}
