package com.project.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.demo.entities.Funds;

@RestController
@RequestMapping(value="/funds")
public class FundsResource {

	@GetMapping
	public ResponseEntity<Funds> findAll(){
		Funds f = new Funds(1L, 123, 874, 748);
		return ResponseEntity.ok().body(f);
	}
	
}
