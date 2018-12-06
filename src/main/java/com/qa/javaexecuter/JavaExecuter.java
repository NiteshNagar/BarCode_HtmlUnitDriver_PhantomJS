package com.qa.javaexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class JavaExecuter {

	WebDriver driver;
	JavascriptExecutor js;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdrive.chrome.drive", "E:\\Chrome\\chromedriver.exe");
		driver =new ChromeDriver();
		
		js =(JavascriptExecutor) driver;
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void googleTileTest() {
	String Title = driver.getTitle();
	System.out.println("Title of page is: " +Title);
	
	if(Title.equals("Google")) {
		Assert.assertTrue(true);
	}else
		Assert.assertTrue(false);
	}
	
	
	
}
