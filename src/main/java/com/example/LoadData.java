package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadData {

	Logger log = LoggerFactory.getLogger(LoadData.class);

	@Autowired
	EmployeeRepository emplRepo;
	
	@Autowired
	OrderRepository orderRepo;
	
	@Bean
	public CommandLineRunner initDB() {
		log.info("Loading data...");
		return args -> {
			emplRepo.save(new Employee("Jonh Bridges", "Role1"));
			emplRepo.save(new Employee("Paul Bridges", "Role2"));
			orderRepo.save(new Order("MacBook Pro", Status.COMPLETED));
      orderRepo.save(new Order("iPhone", Status.IN_PROGRESS));
		};
	}

	@Bean
	public CommandLineRunner checkDB() {
		log.info("Checking data...");
		return args -> {
			for (Employee empl : emplRepo.findAll())
				log.info(empl.toString());
			for (Order order : orderRepo.findAll())
				log.info(order.toString());
		};
	}
}
