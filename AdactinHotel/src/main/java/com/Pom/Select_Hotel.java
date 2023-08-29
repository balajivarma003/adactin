package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement sel;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSel() {
		return sel;
	}

	public Select_Hotel(WebDriver abcde) {
		driver=abcde;
		PageFactory.initElements(driver, this);
		
	}
}
