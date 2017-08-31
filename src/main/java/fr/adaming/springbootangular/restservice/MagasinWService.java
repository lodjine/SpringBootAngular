package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IMagasinDao;
import fr.adaming.springbootangular.model.Magasin;

@RestController
public class MagasinWService {

	@Autowired
	private IMagasinDao magasinDao;
	
	@RequestMapping(value="/magasins", method=RequestMethod.POST)
	public Magasin saveMagasin (@RequestBody Magasin magasin){
		magasinDao.save(magasin);
		return magasin;
	}
	
	@RequestMapping(value="/magasins", method=RequestMethod.PUT)
	public Magasin updateMagasin (@RequestBody Magasin magasin){
		magasinDao.save(magasin);
		return magasin;
	}
	
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public List<Magasin> getMagasins(){
		return magasinDao.findAll();
	}
	
	
	@RequestMapping(value="/magasins/{id}", method=RequestMethod.GET)
	public Magasin getMagasin(@PathVariable Long id){
		return magasinDao.findOne(id);
		}
	
	@RequestMapping(value="/magasins/{id}", method=RequestMethod.DELETE)
	public boolean deleteMagasin(@PathVariable Long id) {
		magasinDao.delete(id);
		return true;
	}
}
