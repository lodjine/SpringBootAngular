package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IProfilDao;
import fr.adaming.springbootangular.model.Profil;

@RestController
public class ProfilWService {
	
	@Autowired
	private IProfilDao profilDao;
	
	@RequestMapping(value="/profils", method=RequestMethod.POST)
	public Profil saveProfil(@RequestBody Profil profil){
		profilDao.save(profil);
		return profil;
	}
	
	@RequestMapping(value="/profils", method=RequestMethod.PUT)
	public Profil updateProfil(@RequestBody Profil profil){
		profilDao.save(profil);
		return profil;
	}
	
	@RequestMapping(value="/profils", method=RequestMethod.GET)
	public List<Profil> getProfils(){
		return profilDao.findAll();
	}
	
	@RequestMapping(value="/profils/{id}", method=RequestMethod.GET)
	public Profil getProfil(@PathVariable Long id){
		return profilDao.findOne(id);
	}
	
	@RequestMapping(value="/profils/{id}", method=RequestMethod.DELETE)
	public boolean deleteProfil(@PathVariable Long id){
		profilDao.delete(id);
		return true;
	}
	

}
