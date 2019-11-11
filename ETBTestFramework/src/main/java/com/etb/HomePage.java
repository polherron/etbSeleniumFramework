package com.etb;

public class HomePage {
	
	static String url = "https://www.donegaletb.ie/";
	static String title = "Donegal ETB &#8211; Education and Training Services";

	public void goTo() {
		Browser.goTo(url);
		
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
