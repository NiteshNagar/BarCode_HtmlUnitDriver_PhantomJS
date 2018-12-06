package com.qa.qslogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class QsLogin {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
	  	 System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");		
	  	 //driver= new ChromeDriver();
		 
	  	 driver = new HtmlUnitDriver();
	  	 
	  	 driver.get("https://quickschool.niitnguru.com/aisedu/");
		
	}
	//admin_1  liveupdate24365w
	
	@Test
	public void getTitleTest() {
	String Title = driver.getTitle();
	System.out.println("Title of page is: " +Title);
	
	}
	
	@Test
	public void login() {
	driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("admin_1");	
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("liveupdate24365w");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
	}
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	
	}
	
}
