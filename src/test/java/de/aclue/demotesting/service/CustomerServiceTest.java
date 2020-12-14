package de.aclue.demotesting.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.aclue.demotesting.model.Customer;

/**
 *
 * @author Jonas Keßler (jonas.kessler@aclue.de)
 */
public class CustomerServiceTest {

	private CustomerService customerService;

	@BeforeAll
	static void beforeAll() {
		// executed only once
	}

	@BeforeEach
	void beforeEach() {
		customerService = new CustomerService();
	}

	@Test
	void findCustomer() {
		Customer actualCustomer = customerService.findCustomer(123L);
		Assertions.assertEquals("Kunde 123",actualCustomer.getName());
		
		// JUnit 
		assertNotNull(actualCustomer);
		assertEquals("Kunde 123",actualCustomer.getName());
		// AssertJ
		assertThat(actualCustomer).isNotNull();
		assertThat(actualCustomer.getName()).isEqualTo("Kunde 123");
	}
}
