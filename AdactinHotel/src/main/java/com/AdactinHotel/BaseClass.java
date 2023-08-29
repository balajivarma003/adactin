package com.AdactinHotel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
     public static WebDriver driver;

	public static WebDriver browser(String s) {
		if (s.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if (s.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver =new OperaDriver();
		}
		return driver;
  }
	
	
	public static void launch(String url) {
		
		driver.get(url);
	}
	public static void searchBox (WebElement ele,String s) {
		ele.sendKeys(s);
	}
	public static void select (WebElement ele) {
		ele.click();
		
	}
	public static void erase(WebElement ele) {
		ele.clear();
	}
	public static void dropdown(WebElement ele) {
	    Select ss= new Select (ele);
	    boolean multiple = ss.isMultiple();
	   // System.out.println("Drop Down"+multiple);
	    ss.selectByIndex(1);
//	    List<WebElement> alloption = ss.getOptions();
//	    for (WebElement allweb : alloption) {
//			System.out.println(allweb.getText());
//		}
//	    System.out.println(alloption.size());
	    
	}
	public static void txt(WebElement e) {
		System.out.println(e.getText());
	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static void mini() {
		Dimension d= new Dimension(500, 500);
		driver.manage().window().setSize(d);
     
	} 
	public static void min() {
		Point dd= new Point(500, 500);
		driver.manage().window().setPosition(dd);
	}
	public static void screenshot() throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des =new File ("C:\\Users\\balaj\\eclipse-workspace\\AdactinHotel\\ScreenCapture\\image.png");
		org.apache.commons.io.FileUtils.copyFile(src, des);
		
	}
}
