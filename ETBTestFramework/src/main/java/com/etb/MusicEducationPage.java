package com.etb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MusicEducationPage extends Page {
	public MusicEducationPage() {
		this.url = "https://www.donegaletb.ie/schools-youth-services/seirbhis-ceoil-music-education/";
		this.title = "Music Education – Donegal ETB";
	}
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='English'])[4]/following::span[1]")
	public WebElement musicEducationHeaderText; 

	public String getHeader() {
		clickCookieNotice();
		return musicEducationHeaderText.getText();
	}
}
