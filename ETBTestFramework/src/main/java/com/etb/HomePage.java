package com.etb;


public class HomePage {
	
	static String url = "https://www.donegaletb.ie/";
	static String title = "Donegal ETB – "
			+ "Education and Training Services";

	public void goTo() {
		Browser.goTo(url);
		
	}
	
	public static void print(String message) {
		System.out.println(message);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	public void clickCookieNotice() {
		Browser.clickCookieNotice();
		
	}
}




