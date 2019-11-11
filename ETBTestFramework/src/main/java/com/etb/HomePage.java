package com.etb;

public class HomePage {
	
	static String url = "https://www.donegaletb.ie/";
	static String title = "Donegal ETB – Education and Training Services";

	public void goTo() {
		Browser.goTo(url);
		
	}
	
	public static void print(String message) {
		System.out.println(message);
	}

	public boolean isAt() {
		print("Actual");
		print(Browser.title());
		print("Expected"); 
		print (title);
		return Browser.title().equals(title);
	}

}
