package de.aclue.demotesting.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import de.aclue.demotesting.AbstractIntegrationTest;

/**
 *
 * @author Jonas Keßler (jonas.kessler@aclue.de)
 */
public class NewsletterServiceIntegrationTest extends AbstractIntegrationTest {

	@Autowired
	private NewsletterService newsLetterService;
	
	@Test
	void sendNewsLetter() {
		newsLetterService.sendNewsletter(123L);
		Mockito.verify(newsletterClientMock).sendNewsletter(Mockito.eq("123"), Mockito.any());
	}
	
}
