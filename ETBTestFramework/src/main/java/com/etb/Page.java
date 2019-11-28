package com.etb;

import org.openqa.selenium.support.PageFactory;

public abstract class Page {
	
	protected String url;
	protected String title;
	
	/**
	 * Constructor
	 */
	public Page() {
		PageFactory.initElements(Browser.driver, this);
	}
	
	public void goTo() {
		Browser.goTo(url);
	}
	
	public boolean isAt() {
		return Browser.title().equals(title);
	}
	
	public void clickCookieNotice() {
		Browser.clickCookieNotice();
	}

}
