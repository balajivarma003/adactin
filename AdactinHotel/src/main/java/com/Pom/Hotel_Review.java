package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Review {
	
	public static WebDriver driver;
	@FindBy(id="first_name")
	private WebElement us;
	
	@FindBy(id="last_name")
	private WebElement ln;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	
	@FindBy(id="cc_type")
	private WebElement cct;
	
	@FindBy(id="cc_exp_month")
	private WebElement exm;
	
	@FindBy(id="cc_exp_year")
	private WebElement exy;

	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bn;
	
	
	
	public static WebDriver getDriver() {
		return driver;
	}



	public WebElement getUs() {
		return us;
	}



	public WebElement getLn() {
		return ln;
	}



	public WebElement getAdd() {
		return add;
	}



	public WebElement getCc() {
		return cc;
	}



	public WebElement getCct() {
		return cct;
	}



	public WebElement getExm() {
		return exm;
	}



	public WebElement getExy() {
		return exy;
	}



	public WebElement getCvv() {
		return cvv;
	}



	public WebElement getBn() {
		return bn;
	}



	public Hotel_Review (WebDriver hr) {
		driver=hr;
		PageFactory.initElements(driver, this);
		
	}
	
}
