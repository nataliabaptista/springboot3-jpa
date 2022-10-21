package com.project.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.entities.Investment;
import com.project.demo.repositories.InvestmentRepository;

@Service
public class InvestmentService {

	@Autowired
	private InvestmentRepository repository;
	
	public List<Investment> findAll(){
		return repository.findAll();
	}
	
	public Investment findById(Long id) {
		Optional<Investment> obj = repository.findById(id);
		return obj.get();	
	}
	
	
	
}
