package com.etb;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class InitialTest {

	@Test
	//Test home page opens properly
	//by checking the page title.
	public void test() {
		Pages.homePage().goTo();
		assertTrue(Pages.homePage().isAt());
	}
	
	@AfterAll
	//Closing the browser
	public static void cleanUp() {
		Browser.close();
	}

}
