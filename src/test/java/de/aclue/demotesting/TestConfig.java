package de.aclue.demotesting;

import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import de.aclue.demotesting.service.NewsletterClient;

/**
 *
 * @author Jonas Keßler (jonas.kessler@aclue.de)
 */
@TestConfiguration
public class TestConfig {
	
	@Bean
	NewsletterClient newsletterClient() {
		return Mockito.mock(NewsletterClient.class);
	}
	
}