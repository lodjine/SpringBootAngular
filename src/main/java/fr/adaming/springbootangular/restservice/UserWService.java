package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.adaming.springbootangular.dao.IUserDao;
import fr.adaming.springbootangular.model.User;

@RestController
public class UserWService {

	@Autowired
	private IUserDao userDao;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		userDao.save(user);
		return user;
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		userDao.save(user);
		return user;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable Long id) {
		return userDao.findOne(id);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable Long id) {
		userDao.delete(id);
		return true;
	}

	@RequestMapping(value = "/userByLogin/{log}/{pw}", method = RequestMethod.GET)
	@ResponseBody
	public String getByLoginAndMp(@PathVariable String log, @PathVariable String pw) {
		User user = userDao.userParLogin(log, pw);
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonInString = mapper.writeValueAsString(user);
			return jsonInString;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/checkLogMp/{log}/{pw}", method = RequestMethod.GET)
	public boolean checkLoginMp(@PathVariable String log, @PathVariable String pw) {
		User user = userDao.userParLogin(log, pw);
		if (user == null)
			return false;
		return true;
	}

}
