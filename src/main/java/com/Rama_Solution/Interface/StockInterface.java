package com.Rama_Solution.Interface;

import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Stock;

public interface StockInterface {
	Stock addStock(Stock st);
	List<Stock> findAllStocks();
	Stock findStockById(Long id);
	void deleteStockById(Long id);
	Stock updateStock(Stock st);
}
