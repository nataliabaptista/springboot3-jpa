package com.project.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entities.Investment;
import com.project.demo.services.InvestmentService;

@RestController
@RequestMapping(value="/investments")
public class InvestmentResource {
	
	@Autowired
	private InvestmentService service;

	@GetMapping
	public ResponseEntity<List<Investment>> findAll(){
		List<Investment> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Investment> findById(@PathVariable Long id){
		Investment obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
