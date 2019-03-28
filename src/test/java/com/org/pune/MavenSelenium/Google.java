package com.org.pune.MavenSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;

	@BeforeTest
	public void beforemethod() {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.VISTA);
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.1.204:5555/grid/register"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://www.google.com/");

		

	}

	@Test
	public void sing() {

		WebElement username = driver.findElement(By.className("gLFyf gsfi"));
		username.sendKeys("xyz");

	}

	@AfterTest
	public void aftermethod() {
		driver.quit();
	}
}
