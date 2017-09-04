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
import fr.adaming.springbootangular.model.Magasin;

@RestController
public class MagasinWService {

	@Autowired
	private IBatimentDao magasinDao;
	
	@RequestMapping(value="/magasin", method=RequestMethod.POST)
	public Magasin saveMagasin (@RequestBody Magasin magasin){
		magasinDao.save(magasin);
		return magasin;
	}
	
	@RequestMapping(value="/magasin", method=RequestMethod.PUT)
	public Magasin updateMagasin (@RequestBody Magasin magasin){
		magasinDao.save(magasin);
		return magasin;
	}
	
	@RequestMapping(value="/magasin", method=RequestMethod.GET)
	public List<Magasin> getMagasins(){
		List<Batiment> list = magasinDao.findAll();
		List<Magasin> lM = new ArrayList<>();
		for (Batiment b: list){
			lM.add((Magasin) b);
		}
		return lM;
	}
	
	
	@RequestMapping(value="/magasin/{id}", method=RequestMethod.GET)
	public Magasin getMagasin(@PathVariable Long id){
		return (Magasin) magasinDao.findOne(id);
		}
	
	@RequestMapping(value="/magasin/{id}", method=RequestMethod.DELETE)
	public boolean deleteMagasin(@PathVariable Long id) {
		magasinDao.delete(id);
		return true;
	}
}
