package com.step;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Hook {
	
	public static WebDriver driver;
	
	
	@Before
	
	public static void launch() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Photon\\Day1Practice\\Chromed\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
	}
	
	
	
	@After
	
	public static void kill() {
		
		driver.quit();
		
	}
	
	
	

}
