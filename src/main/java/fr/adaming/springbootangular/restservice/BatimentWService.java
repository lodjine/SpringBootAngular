package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IBatimentDao;
import fr.adaming.springbootangular.model.Batiment;

@RestController
public class BatimentWService {
	
	@Autowired
	private IBatimentDao batimentDao;
	
	@RequestMapping(value="/batiments", method=RequestMethod.POST)
	public Batiment saveBatiment(@RequestBody Batiment batiment){
		batimentDao.save(batiment);
		return batiment;
	}
	
	@RequestMapping(value="/batiments", method=RequestMethod.PUT)
	public Batiment updateBatiment(@RequestBody Batiment batiment){
		batimentDao.save(batiment);
		return batiment;
	}
	
	@RequestMapping(value="/batiments", method=RequestMethod.PUT)
	public List<Batiment> getBatiments(){
		return batimentDao.findAll();
	}
	
	@RequestMapping(value="/batiments/{id}", method=RequestMethod.GET)	
	public Batiment getBatiment(@PathVariable Long id){
		return batimentDao.findOne(id);
	}
	
	@RequestMapping(value="/batiments/{id}", method=RequestMethod.DELETE)
	public void deleteBatiment(@PathVariable Long id){
		batimentDao.delete(id);
	}

}
