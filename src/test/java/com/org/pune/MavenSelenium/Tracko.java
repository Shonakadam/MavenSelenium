package com.org.pune.MavenSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Tracko {
	
	WebDriver driver;
    
	@BeforeMethod
	public void beforetest(String bro) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.VISTA);

		try {
			driver = new RemoteWebDriver(new URL("http://192.168.1.204:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://dev.tracko.co.in/trackoweb/index.html");
		
		
	}

	@Test()
	public void sign() {
		WebElement singnbut = driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
		singnbut.click();
	}

	@AfterMethod
	public void aftermethod() {
		driver.quit();
	}
}
