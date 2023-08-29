package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.AdactinHotel.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/adactin/feature",glue ="com.adactin.stepdefinition",
monochrome=true,
dryRun=false,

strict=true,
//tags= {"@smoke"},
//plugin= {"html:Report/AdactinHotel","pretty","json:JsonReport/AdactinJs.json",
		//"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/AdactinExtent.html"}
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/AdactinExtent.html"}
)

public class Test_Runner extends BaseClass{ /// Launch the browser
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
		driver =browser("Chrome");
		
		
}

	@AfterClass
	public static void tear_Down() throws InterruptedException {//Close the browser
		Thread.sleep(3000);
		driver.quit();
	}
}
