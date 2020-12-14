package de.aclue.demotesting.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Jonas Keßler (jonas.kessler@aclue.de)
 */
@Slf4j
@Service
public class NewsletterClient {

	public boolean optIn(String userId) {
		log.info("ExampleNewsletterClient.optIn called with userId={}", userId);
		return false;
	}

	public void sendNewsletter(String userId, String text) {
		log.info("ExampleNewsletterClient.optIn called with userId={}, text={}", userId, text);
	}

}
