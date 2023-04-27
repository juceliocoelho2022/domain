package com.desenvolvedor.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desenvolvedor.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
  
}
