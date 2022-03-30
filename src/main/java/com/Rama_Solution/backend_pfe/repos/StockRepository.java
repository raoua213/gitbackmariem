package com.Rama_Solution.backend_pfe.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rama_Solution.backend_pfe.entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
