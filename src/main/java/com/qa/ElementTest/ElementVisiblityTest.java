package com.qa.ElementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementVisiblityTest {

	@Test
	public void elementTest() {
	 System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");
  	 WebDriver driver = new ChromeDriver();
  	 
  	 driver.manage().window().maximize();
  	 driver.manage().deleteAllCookies();
  	 
  	 driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
  	 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
  	 
  	 driver.get("https://www.freecrm.com/register/");
	 
  	 //isDisplayed(): for all the element Return True / False
  	 boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();
  	 System.out.println(b1); //True
  	 
  	 boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
 	 System.out.println(b2); //False
 	  	 
 	//isSelected only applicable for checkBox, dropDown, radioButtons.
 	 boolean b3 = driver.findElement(By.name("agreeTerms")).isSelected();
	 System.out.println(b3); //False 
 	 	 
	}
	
}

