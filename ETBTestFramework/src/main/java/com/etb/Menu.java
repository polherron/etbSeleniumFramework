package com.etb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Menu extends Page {
	
	WebDriverWait wait; 
	
	
	/**
	 * 
	 */
	public Menu() {
		super();
		waitUntilClickable();
	}

	private void waitUntilClickable() {
		new WebDriverWait(Browser.driver, 60)
        .until(ExpectedConditions.elementToBeClickable(musicLink));
	}

	//Examples of using @FindBy annotation.
	@FindBy(linkText = "Schools & Youth Services")
	public WebElement schoolsAndYouthServicesLink;
	
	@FindBy(linkText = "Music Education")
	public WebElement musicLink; 
		
	@FindBy(linkText = "Post-Primary Schools")
	public WebElement postPrimarySchoolsLink; 
	
}

