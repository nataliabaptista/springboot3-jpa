package com.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.demo.entities.Funds;
public interface FundsRepository extends JpaRepository<Funds, Long>{
	
}
