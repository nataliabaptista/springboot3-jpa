package com.project.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.entities.Funds;
import com.project.demo.repositories.FundsRepository;

@Service
public class FundsService {

	@Autowired
	private FundsRepository repository;
	
	public List<Funds> findAll(){
		return repository.findAll();
	}
	
	public Funds findById(Long id) {
		Optional<Funds> obj = repository.findById(id);
		return obj.get();	
	}
	
	
	
}
