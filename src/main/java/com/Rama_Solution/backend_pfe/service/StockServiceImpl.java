package com.Rama_Solution.backend_pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.backend_pfe.entities.Stock;
import com.Rama_Solution.backend_pfe.repos.StockRepository;
import com.Rama_Solution.serviceImpl.StockInterface;

@Service
public class StockServiceImpl implements StockInterface {
	@Autowired
	StockRepository stockRepository;

	@Override
	public Stock addStock(Stock st) {
		return stockRepository.save(st);
	}

	@Override
	public List<Stock> findAllStocks() {
		return stockRepository.findAll();
	}

	@Override
	public Stock findStockById(Long id) {
		return stockRepository.findById(id).get();
	}

	@Override
	public void deleteStockById(Long id) {
		stockRepository.deleteById(id);
	}

	@Override
	public Stock updateStock(Stock st) {
		return stockRepository.save(st);
	}

}
