package com.etb;

import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class InitialTests {

	@Test
	//Test home page opens properly
	//by checking the page title.
	public void testHomePage() {
		Pages.homePage().goTo();
		assertTrue(Pages.homePage().isAt());
	}
	
	@Test
	//Test home page opens properly
	//by checking the page title.
	public void testMusicEducationPage() {
		Pages.homePage().goTo();
		Pages.homePage().clickCookieNotice();
		Pages.menuPage().musicLink.click();
		assertTrue(Pages.musicEducationPage().isAt());
	}
	
	@AfterAll
	//Closing the browser
	public static void cleanUp() {
		Browser.close();
	}
	
}


