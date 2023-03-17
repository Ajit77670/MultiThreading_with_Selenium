package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public WebDriver driver;

	//initialize driver:
	public WebDriver setup(String browserName) {
			
	if(browserName.equalsIgnoreCase("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith Kumar\\Downloads\\Eclipse\\ChromoDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
		
	else if(browserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Ajith Kumar\\Downloads\\Eclipse\\geekoDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
	
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
		
		
		
	
	
	}
	

}
