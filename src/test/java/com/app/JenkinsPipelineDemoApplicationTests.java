package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsPipelineDemoApplicationTests {

	@Test
	public void testSuma() {
		assertEquals(5, JenkinsPipelineDemoApplication.sumar(2, 3));
		}

}
