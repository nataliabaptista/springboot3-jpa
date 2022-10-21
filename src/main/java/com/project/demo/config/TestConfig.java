package com.project.demo.config;

import java.time.Instant;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.project.demo.entities.Funds;
import com.project.demo.entities.Order;
import com.project.demo.entities.enums.OrderStatus;
import com.project.demo.repositories.FundsRepository;
import com.project.demo.repositories.OrderRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private FundsRepository fundsRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		Funds f1 = new Funds(null, "8493", "234", "988888888");
		Funds f2 = new Funds(null, "7438", "987", "977777777");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.ORDERED_PURCHASE, f1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.ORDERED_PURCHASE,f2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED ,f1);
	
		fundsRepository.saveAll(Arrays.asList(f1, f2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}