package com.project.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entities.Funds;
import com.project.demo.services.FundsService;

@RestController
@RequestMapping(value="/funds")
public class FundsResource {
	
	@Autowired
	private FundsService service;

	@GetMapping
	public ResponseEntity<List<Funds>> findAll(){
		List<Funds> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Funds> findById(@PathVariable Long id){
		Funds obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
