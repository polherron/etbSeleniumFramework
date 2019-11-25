package com.etb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	
	/**
	 * Constructor
	 */
	public Menu() {
		PageFactory.initElements(Browser.driver, this);
	}

	@FindBy(linkText = "Schools & Youth Services")
	public WebElement schoolsAndYouthServicesLink;
	
	@FindBy(linkText = "Music Education")
	public WebElement musicLink; 
	
	@FindBy(linkText = "Post-Primary Schools")
	public WebElement postPrimarySchoolsLink; 
	
}

