package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.Pom.Adactin_Login;
import com.Pom.Hotel_Review;
import com.Pom.Search_Hotel;
import com.Pom.Select_Hotel;

public class Page_Object_Manager {
	public static WebDriver driver;	
	
	private Adactin_Login lp;
	
	private Search_Hotel sh;
	
	private Select_Hotel seh;
	
	private Hotel_Review hr;
	
	public Page_Object_Manager(WebDriver abc){
		driver=abc;
		
	}
	
	public Adactin_Login getAdactin_Login() {
		
		lp=new Adactin_Login(driver);
		return lp;
		
	}
	
	public Search_Hotel getSearch_Hotel() {
		sh =new Search_Hotel(driver);
		return sh;
		
	}
	
	public Select_Hotel getSelect_Hotel() {
		seh=new Select_Hotel(driver);
		return seh;
		
	}
	
	public Hotel_Review getHotel_Review() {
		hr=new Hotel_Review(driver);
		return hr;
		
	}
	
	
	
	

}
