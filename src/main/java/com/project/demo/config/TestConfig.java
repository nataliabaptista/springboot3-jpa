package com.project.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.demo.entities.Funds;
import com.project.demo.repositories.FundsRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private FundsRepository fundsRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Funds f1 = new Funds(null, "8493", "234", "988888888");
		Funds f2 = new Funds(null, "7438", "987", "977777777");

		fundsRepository.saveAll(Arrays.asList(f1, f2));
	}

}
