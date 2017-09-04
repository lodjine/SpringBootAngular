package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IUserDao;
import fr.adaming.springbootangular.model.User;

@RestController
public class UserWService {
	
	@Autowired
	private IUserDao userDao;
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User saveUser(@RequestBody User user){
		userDao.save(user);
		return user;
	}
	
	@RequestMapping(value="/user", method=RequestMethod.PUT)
	public User updateUser(@RequestBody User user){
		userDao.save(user);
		return user;
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public List<User> getUsers(){
		return userDao.findAll();
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable Long id){
		return userDao.findOne(id);
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable Long id){
		userDao.delete(id);
		return true;
	}
	

}
