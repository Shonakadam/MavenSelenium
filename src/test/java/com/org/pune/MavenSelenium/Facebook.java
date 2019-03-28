package com.org.pune.MavenSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Facebook {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement emailIdcss=driver.findElement(By.cssSelector("input[name='email']"));
  	emailIdcss.sendKeys("shonakadam@gmail.com");
  	
  	WebElement passwordcss= driver.findElement(By.cssSelector("#pass"));   //input[id=pass]
  	passwordcss.sendKeys("passwordmy123");
  	
  	WebElement loginbutcsscontains= driver.findElement(By.cssSelector("button[id*='loginbutton']"));    // * anything
  	loginbutcsscontains.click();  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
