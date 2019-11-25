package com.etb;

import org.openqa.selenium.By;

public class HomePage extends Page{

	/**
	 * @param url
	 * @param title
	 */
	public HomePage() {
		this.url = "https://www.donegaletb.ie/";
		this.title = "Donegal ETB – "
				+ "Education and Training Services";
	}
}




