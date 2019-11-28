package com.etb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class InitialTests {

	/*@Test
	//Test home page opens properly
	//by checking the page title.
	public void testHomePage() {
		Pages.homePage().goTo();
		assertTrue(Pages.homePage().isAt());
	}
	
	@Test
	//Test home page opens properly
	//by checking the page title.
		public void testMusicEducationLink() {
		Pages.homePage().goTo();
		Pages.homePage().clickCookieNotice();
		Pages.menuPage().musicLink.click();
		assertTrue(Pages.musicEducationPage().isAt());
	}
	*/
	@Test
	//Test home page opens properly
	//by checking the page title.
		public void testMusicEducationHeaderText() {
		Pages.homePage().goTo();
		Pages.homePage().clickCookieNotice();
		Pages.menuPage().musicLink.click();
		assertTrue(Pages.musicEducationPage().getHeader().equals("Donegal Music Education Partnership"));
	}
	
	
	@AfterClass
	//Closing the browser
	public static void cleanUp() {
		Browser.close();
	}
	
}


