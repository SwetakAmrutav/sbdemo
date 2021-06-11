package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbDemoApplicationTests {

	@Test
	void contextLoads() {
		String string = "JUnit";
		assertEquals("JUnit", string);
	}

}
