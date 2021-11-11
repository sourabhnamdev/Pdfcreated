package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootApplication
public class PdfcreatedApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(PdfcreatedApplication.class, args);
	}

	public void run(String... args) throws Exception {

		if (customerRepository.count() == 0) {
			// save a list of Customers
			customerRepository.saveAll(Arrays.asList(new Customer("Jack", "Smith"), new Customer("Adam", "Johnson"),
					new Customer("Kim", "Smith"), new Customer("David", "Williams"), new Customer("Peter", "Davis")));
		}

	}

}
