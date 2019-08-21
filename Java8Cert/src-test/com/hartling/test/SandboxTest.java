package com.hartling.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Gerald.Hartling
 * 
 */
public class SandboxTest {
	private static final Logger logger = Logger.getLogger(SandboxTest.class);

	@Before
	public final void setupBeforeMethod() {

	}

	@After
	public final void tearDownAfterMethod() {

	}

	@Test
	public void testTimestamp() {
		LocalDateTime ld = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd-hh:mm:ss.SSS");
		System.out.println(df.format(ld));
	}
}
