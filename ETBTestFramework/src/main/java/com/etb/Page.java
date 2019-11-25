package com.etb;

public abstract class Page {
	
	protected String url;
	protected String title;
	
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
