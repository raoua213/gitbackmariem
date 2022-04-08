package com.Rama_Solution.backend_pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Stock;
import com.Rama_Solution.backend_pfe.service.StockServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StockController {
	@Autowired
	private StockServiceImpl stockServiceImpl;
	
	@PostMapping("/addStock")
	public Stock addStock(@RequestBody Stock st) {
		return stockServiceImpl.addStock(st);
	}
	
	@GetMapping("/findAllStocks")
	public List<Stock> findAllStocks() {
		return stockServiceImpl.findAllStocks();
	}
	
	@GetMapping("/findStockById")
	public Stock findStockById(Long id) {
		return stockServiceImpl.findStockById(id);
	}
	
	@DeleteMapping("/deleteStockById")
	public void deleteStockById(@RequestParam Long id) {
		stockServiceImpl.deleteStockById(id);
	}
	
	@PutMapping("/updateStock")
	public Stock updateStock(@RequestBody Stock st) {
		return stockServiceImpl.updateStock(st);
	}

}
