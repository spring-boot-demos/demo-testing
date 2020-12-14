package de.aclue.demotesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import de.aclue.demotesting.model.Order;
import de.aclue.demotesting.service.NewsletterService;
import de.aclue.demotesting.service.OrderService;

@SpringBootApplication
@EnableCaching
public class DemoTestingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoTestingApplication.class, args);
		
		OrderService orderService = context.getBean(OrderService.class);
		long customerId = 123l;
		Order order = orderService.createOrder("3 Bananen", 123L);
		System.out.println(order);
		
		NewsletterService newsletterService = context.getBean(NewsletterService.class);
		newsletterService.sendNewsletter(customerId);
	}

}
