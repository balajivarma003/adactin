package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {
	public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement element;
	
	
	@FindBy(id="password")
	private WebElement element1;
	
	@FindBy(id="login")
	private WebElement log;
	
	public WebElement getElement() {
		return element;
	}

	public WebElement getElement1() {
		return element1;
	}

	public WebElement getLog() {
		return log;
	}
	
	public Adactin_Login(WebDriver abc) {
		driver=abc;
		PageFactory.initElements(driver, this);
		
	}

}
