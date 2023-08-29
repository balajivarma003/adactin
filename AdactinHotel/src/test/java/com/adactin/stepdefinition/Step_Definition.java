package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.AdactinHotel.BaseClass;
import com.PageObjectManager.Page_Object_Manager;
import com.Pom.Adactin_Login;
import com.Pom.Hotel_Review;
import com.Pom.Search_Hotel;
import com.Pom.Select_Hotel;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	public static WebDriver driver =Test_Runner.driver ;
	
	public static Page_Object_Manager pom= new Page_Object_Manager(driver);
	
	
	//Adactin_Login adac= new Adactin_Login(driver);
	
	//Search_Hotel  sh= new Search_Hotel(driver);
	
	//Select_Hotel  seh= new Select_Hotel(driver);
	
	//Hotel_Review  rev= new Hotel_Review(driver);
	
    //class name refname= new constructor name();	
	
//	@Given("^user Launch The Adactin Applicaton$")
//	public void user_Launch_The_Adactin_Applicaton() throws Throwable {
//		launch("https://adactinhotelapp.com/");
//		max();
//	    
//	}
//
//	@When("^user Enter The \"([^\"]*)\" In Username Field$")
//	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
//	    searchBox(pom.getAdactin_Login().getElement(),username);
//	}
//
//	@When("^user Enter The \"([^\"]*)\" In Password Field$")
//	public void user_Enter_The_In_Password_Field(String arg1) throws Throwable {
//		
//	   searchBox(pom.getAdactin_Login().getElement1(),arg1);
//	}
//
//	@Then("^user Click On The Login Button And It Navigate To Search Hotel Page$")
//	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
//	    select(pom.getAdactin_Login().getLog());
//	}

	
	@Given("^user Launch The Adactin Applicaton$")
	public void user_Launch_The_Adactin_Applicaton() throws Throwable {
		launch("https://adactinhotelapp.com/");
		max();
	    
	}
	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		searchBox(pom.getAdactin_Login().getElement(),"Balaji001");
		
	    	}



//	@When("^user Enter The Username In Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_In_Username_Field() throws Throwable {
//		
//		searchBox(pom.getAdactin_Login().getElement(),"Balaji001");
//        //driver.findElement(By.id("username")).sendKeys("Balaji001");
//	    
//	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		
	  // WebElement element1 = driver.findElement(By.id("password"));
	   searchBox(pom.getAdactin_Login().getElement1(),"balaji003");
	   
	}

	@Then("^user Click On The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
	  
		// WebElement log = driver.findElement(By.id("login"));
	    select(pom.getAdactin_Login().getLog());
	}

	@When("^user Select The Location In Select Location Field$")
	public void user_Select_The_Location_In_Select_Location_Field() throws Throwable {
		
	  //WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
	  dropdown(pom.getSearch_Hotel().getLoc());
	}

	@When("^user The Hotel In Select Hotel Field$")
	public void user_The_Hotel_In_Select_Hotel_Field() throws Throwable {
	   // WebElement hot = driver.findElement(By.xpath("//select[@name='hotels']"));
	    dropdown(pom.getSearch_Hotel().getHot());
	}

	@When("^user Select The Room Type In Select Room Type Field$")
	public void user_Select_The_Room_Type_In_Select_Room_Type_Field() throws Throwable {
	  // WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
	   dropdown(pom.getSearch_Hotel().getRoomType());
	}

	@When("^user Select Number Of Rooms In Drop Down$")
	public void user_Select_Number_Of_Rooms_In_Drop_Down() throws Throwable {
	    //WebElement noroom = driver.findElement(By.xpath("//select[@name='room_nos']"));
	    dropdown(pom.getSearch_Hotel().getNoRoom());
	    
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		//WebElement checkIn = driver.findElement(By.id("datepick_in"));
		erase(pom.getSearch_Hotel().getCheckIn());
		searchBox(pom.getSearch_Hotel().getCheckIn(),"30/07/2023");
	}

	@When("^user Enter Check Out Date$")
	public void user_Enter_Check_Out_Date() throws Throwable {
	   //WebElement checkOut = driver.findElement(By.id("datepick_out"));
	   erase(pom.getSearch_Hotel().getCheckOut());
	   searchBox(pom.getSearch_Hotel().getCheckOut(),"31/07/2023");
	}

	@When("^user Enter Adult Per Rooms$")
	public void user_Enter_Adult_Per_Rooms() throws Throwable {
	    //WebElement adult = driver.findElement(By.id("adult_room"));
	    dropdown(pom.getSearch_Hotel().getAdult());
	    
	}

	@When("^user Enter Children Per Rooms$")
	public void user_Enter_Children_Per_Rooms() throws Throwable {
		//WebElement child = driver.findElement(By.id("child_room"));
		dropdown(pom.getSearch_Hotel().getChild());
	    
	}

	@Then("^user Click On The Search Button And It Naviagate To Select Hoetel Page$")
	public void user_Click_On_The_Search_Button_And_It_Naviagate_To_Select_Hoetel_Page() throws Throwable {
	    //WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
	    select(pom.getSearch_Hotel().getSearch());
	}

	@When("^user Click On The Radio Button Select Field$")
	public void user_Click_On_The_Radio_Button_Select_Field() throws Throwable {
	   // WebElement radio = driver.findElement(By.id("radiobutton_0"));
	    select(pom.getSelect_Hotel().getRadio());
	}

	@Then("^user Click On The Continue Button It Navigate To Hotel Review Page$")
	public void user_Click_On_The_Continue_Button_It_Navigate_To_Hotel_Review_Page() throws Throwable {
	    //WebElement sel = driver.findElement(By.id("continue"));
	    select(pom.getSelect_Hotel().getSel());
	    
	}

	@When("^user Enter The First Name In User Field$")
	public void user_Enter_The_First_Name_In_User_Field() throws Throwable {
	    //WebElement us = driver.findElement(By.id("first_name"));
	    searchBox(pom.getHotel_Review().getUs(),"Balaji");
	    
	}

	@When("^user Enter The Last Name In User Field$")
	public void user_Enter_The_Last_Name_In_User_Field() throws Throwable {
	   // WebElement ln = driver.findElement(By.id("last_name"));
	    searchBox(pom.getHotel_Review().getLn(),"Ravi");
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		//WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
		searchBox(pom.getHotel_Review().getAdd(),"no23/27 kk nagar chennai-116");
	    
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
	  // WebElement cc = driver.findElement(By.id("cc_num"));
	   searchBox(pom.getHotel_Review().getCc(),"123456789123456");
	}

	@When("^user Enter The Card Type$")
	public void user_Enter_The_Card_Type() throws Throwable {
		//WebElement cct = driver.findElement(By.id("cc_type"));
		dropdown(pom.getHotel_Review().getCct());
	}

	@When("^user Select Expiry Date And Expiry Year$")
	public void user_Select_Expiry_Date_And_Expiry_Year() throws Throwable {
		//WebElement exm = driver.findElement(By.id("cc_exp_month"));
		dropdown(pom.getHotel_Review().getExm());
		//WebElement exy = driver.findElement(By.id("cc_exp_year"));
	    dropdown(pom.getHotel_Review().getExy());
	}

	@When("^user Enter The Cvv$")
	public void user_Enter_The_Cvv() throws Throwable {
	    //WebElement cvv = driver.findElement(By.id("cc_cvv"));
	    searchBox(pom.getHotel_Review().getCvv(),"734");
	}

	@Then("^user Click On The Book Now Button$")
	public void user_Click_On_The_Book_Now_Button() throws Throwable {
		//WebElement bn = driver.findElement(By.id("book_now"));
		select(pom.getHotel_Review().getBn());
	   
	}

}
