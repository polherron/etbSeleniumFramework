package com.etb;

import static org.junit.Assert.*;

import org.junit.Test;

public class InitialTests {

	@Test
	//Comment added
	public void test() {
		Pages.homePage().goTo();
		assertTrue(Pages.homePage().isAt());
	}
}
