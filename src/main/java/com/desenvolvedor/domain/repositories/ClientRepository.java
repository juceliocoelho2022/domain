package com.desenvolvedor.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.desenvolvedor.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
  
}
