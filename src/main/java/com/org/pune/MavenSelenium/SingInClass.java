package com.org.pune.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingInClass 
{
	WebDriver driver;
	public SingInClass(WebDriver driver2) {
		driver=driver2;
	}
	public void SingInFunction()
	
	
	{

		  WebElement SignInButn= driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));	
		  SignInButn .click();
		  
		  WebElement UserId= driver.findElement(By.id("email"));
		  UserId.sendKeys("kanchankadam@gmail.com");
		  
		  WebElement password= driver.findElement(By.id("passwd"));
		  password.sendKeys("kanchanpassword"); 
		  
		  WebElement SingUpButn= driver.findElement(By.id("SubmitLogin"));
		  SingUpButn.click();

}
		
	}
