package com.etb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class InitialTests {

	@Test
	//Test home page opens properly
	//by checking the page title.
	public void test() {
		Pages.homePage().goTo();
		assertTrue(Pages.homePage().isAt());
	}
	
	@After
	//Closing the browser
	public void cleanUp() {
		Browser.close();
	}
	
}


