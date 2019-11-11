package com.etb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	static WebDriver driver = new FirefoxDriver();

	public static void goTo(String url) {
		driver.get(url);
	}
	
	public static String title()
	{
		return driver.getTitle();
	}
	
}
