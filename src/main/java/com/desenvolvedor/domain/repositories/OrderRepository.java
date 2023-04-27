package com.desenvolvedor.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desenvolvedor.domain.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
  
}
