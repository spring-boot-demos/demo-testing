package de.aclue.demotesting.service;

import org.springframework.stereotype.Service;

import de.aclue.demotesting.model.Customer;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NewsletterService {

	private final CustomerService customerService;
	private final NewsletterClient newsletterClient;
	
	public void sendNewsletter(Long customerId) {
		Customer customer = customerService.findCustomer(customerId);
		newsletterClient.sendNewsletter(Long.toString(customerId), "Hallo" + customer.getName());
	}
	
	public boolean optIn(Long customerId) {
		return newsletterClient.optIn(Long.toString(customerId));
	}
	
	
}
