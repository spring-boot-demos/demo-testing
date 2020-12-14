package de.aclue.demotesting.service;

import org.springframework.stereotype.Service;

import de.aclue.demotesting.model.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrderService {
	
	private final CustomerService customerService;
	
	public Order createOrder(String content, Long userId) {
		return new Order(content, customerService.findCustomer(userId));
	}
	
}
