package com.desenvolvedor.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desenvolvedor.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
  
}
