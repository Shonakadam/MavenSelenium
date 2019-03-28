package com.org.pune.MavenSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.eclipse.com/");
    }
}
