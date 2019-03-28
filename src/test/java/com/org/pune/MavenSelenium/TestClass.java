package com.org.pune.MavenSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestClass {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {

      System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.get("http://www.eclipse.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
