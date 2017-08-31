package fr.adaming.springbootangular.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IStockDao;
import fr.adaming.springbootangular.model.IdStock;
import fr.adaming.springbootangular.model.Stock;

@RestController
public class StockWService {

	@Autowired
	private IStockDao stockDao;

	@RequestMapping(value = "/stocks", method = RequestMethod.POST)
	public Stock saveStock(@RequestBody Stock stock) {
		stockDao.save(stock);
		return stock;
	}

	@RequestMapping(value = "/stocks", method = RequestMethod.PUT)
	public Stock updateStock(@RequestBody Stock stock) {
		stockDao.save(stock);
		return stock;
	}

	@RequestMapping(value = "/stocks", method = RequestMethod.GET)
	public List<Stock> getStock() {
		return stockDao.findAll();
	}

	@RequestMapping(value = "/stocks/{id}", method = RequestMethod.GET)
	public Stock getStock(@PathVariable IdStock id) {
		return stockDao.findOne(id);
	}

	@RequestMapping(value = "/stocks/{id}", method = RequestMethod.GET)
	public boolean deleteStock(@PathVariable IdStock id) {
		stockDao.delete(id);
		return true;
	}

}