package com.etb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	static WebDriver driver = new FirefoxDriver();

	public static void goTo(String url) {
		driver.get(url);
	}
	
	public static String title(){
		return driver.getTitle();
	}

	public static void close() {
		driver.close();
	}

	public static WebElement findElementByLinkText(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.linkText(string));
	}

	public static void clickCookieNotice() {
		WebElement cookieNotice = driver.findElement(By.id("cookie_action_close_header"));
		if(cookieNotice.isDisplayed() && cookieNotice.isEnabled()) {
			cookieNotice.click();
		}
	}
}


