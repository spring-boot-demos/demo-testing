package de.aclue.demotesting;

import org.junit.jupiter.api.AfterEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import de.aclue.demotesting.service.NewsletterClient;

/**
 *
 * @author Jonas Keßler (jonas.kessler@aclue.de)
 */
@SpringBootTest
@ActiveProfiles(value = "integrationtest")
@Import(TestConfig.class)
public abstract class AbstractIntegrationTest {

	@Autowired
	protected NewsletterClient newsletterClientMock;
	
	@AfterEach
	void teardown() {
		Mockito.verifyNoMoreInteractions(newsletterClientMock);
	}
	
}
