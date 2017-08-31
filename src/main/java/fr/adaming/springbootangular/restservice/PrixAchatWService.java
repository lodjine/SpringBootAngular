package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IPrixAchatDao;
import fr.adaming.springbootangular.model.IdPrixAchat;
import fr.adaming.springbootangular.model.PrixAchat;

@RestController
public class PrixAchatWService {

	@Autowired
	private IPrixAchatDao prixAchatDao;

	@RequestMapping(value = "/prix_achats", method = RequestMethod.POST)
	public PrixAchat savePrixAchat(@RequestBody PrixAchat prixAchat) {
		prixAchatDao.save(prixAchat);
		return prixAchat;
	}

	@RequestMapping(value = "/prix_achats", method = RequestMethod.PUT)
	public PrixAchat updateStock(@RequestBody PrixAchat prixAchat) {
		prixAchatDao.save(prixAchat);
		return prixAchat;
	}

	@RequestMapping(value = "/prix_achats", method = RequestMethod.GET)
	public List<PrixAchat> getPrixAchat() {
		return prixAchatDao.findAll();
	}

	@RequestMapping(value = "/prix_achats/{id}", method = RequestMethod.GET)
	public PrixAchat getPrixAchat(@PathVariable IdPrixAchat id) {
		return prixAchatDao.findOne(id);
	}

	@RequestMapping(value = "/prix_achats/{id}", method = RequestMethod.GET)
	public boolean deletePrixAchat(@PathVariable IdPrixAchat id) {
		prixAchatDao.delete(id);
		return true;
	}

}