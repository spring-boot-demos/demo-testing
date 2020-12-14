package de.aclue.demotesting.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import de.aclue.demotesting.model.Customer;

@Service
public class CustomerService {

	@Cacheable("customers")
	public Customer findCustomer(Long id) {
		return new Customer("Kunde " + id);
	}

	@PostConstruct
	public void initCache() {
		System.out.println("initCache");
	}

	@PreDestroy
	public void destroyCache() {
		System.out.println("destroyCache");
	}

}
