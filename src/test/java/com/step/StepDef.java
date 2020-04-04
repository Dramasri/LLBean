package com.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.POJO1;
import com.utility.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDef extends Base {
	
	
	/*@Given("Launch the application")
	public void launch_the_application() throws InterruptedException {
		
		Hook.driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		launch("https://global.llbean.com/");
		
		
		Thread.sleep(10000);
		
		Hook.driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-close ui-corner-all']")).click();
		
		WebDriverWait wt = new WebDriverWait(Hook.driver, 20);
		
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='shipToCloseBtn closeDialog']")));
		
		Hook.driver.findElement(By.xpath("//a[@class='shipToCloseBtn closeDialog']")).click();
		
		
	    
	}

	@When("Searching for jeans for women")
	public void searching_for_jeans_for_women() throws AWTException {
		
		
		POJO1 pj = new POJO1();
		
		fill(pj.getSrch(), "jeans for women");
		
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
	    
	}

	@Then("List of products appeared")
	public void list_of_products_appeared() throws InterruptedException {
		
		Thread.sleep(15000);
		
		Assert.assertEquals(Hook.driver.getTitle().contains("Jeans For Women"), "Jeans For Women");
		
		
		System.out.println("list of elements appered");
	   
	}
	*/
	
	/*@Given("Launch the webpage")
	public void launch_the_webpage() throws Throwable {
		
		Hook.driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		launch("https://global.llbean.com/");
		
        Thread.sleep(15000);
		
		Hook.driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-close ui-corner-all']")).click();
		
		WebDriverWait wt = new WebDriverWait(Hook.driver, 25);
		
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='shipToCloseBtn closeDialog']")));
		
		Hook.driver.findElement(By.xpath("//a[@class='shipToCloseBtn closeDialog']")).click();
	   
	}

	@When("Move the element to account")
	public void move_the_element_to_account() {
		
		// actions //
		
		
		WebElement lgn = Hook.driver.findElement(By.xpath("//div[@class='header-account']"));
		
		Actions ac = new Actions(Hook.driver);
		
		ac.moveToElement(lgn).perform();
		
		//div[@class='header-account']
		
		//(By.xpath("//a[@class='user-login']"))
	    
	}

	@When("Click login and enter the details")
	public void click_login_and_enter_the_details() throws Throwable {
		
		Thread.sleep(5000);
		
		WebElement click = Hook.driver.findElement(By.xpath("//a[@id='sign-in']"));
		
		clk(click);
		
		Thread.sleep(5000);
		
		WebElement user = Hook.driver.findElement(By.xpath("//input[@name='dwfrm_login_username_d0uymtpxpdkb']"));
		
		fill(user, exclRead().get(1).get("user"));
		
		Thread.sleep(10000);
		
		WebElement pass = Hook.driver.findElement(By.id("dwfrm_login_password"));
		
		fill(pass, exclRead().get(0).get("pass"));
	   
	}

	@When("click the login button")
	public void click_the_login_button() {
		
		WebElement btn = Hook.driver.findElement(By.xpath("//button[@title='Secure Login']"));
		
		clk(btn);
	   
	}

	@Then("Takes to the home page")
	public void takes_to_the_home_page() {
		
		System.out.println("home page ");
	    
	}
	*/
	
	
	@Given("Launch the webpage")
	public void launch_the_webpage1() {
		
		launch("https://global.llbean.com/");
		
		Hook.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Hook.driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-close ui-corner-all']")).click();
		
		Hook.driver.findElement(By.xpath("//a[@class='shipToCloseBtn closeDialog']")).click();
		
	   
	}

	@When("Go to search module and give as bags for women")
	public void go_to_search_module_and_give_as_bags_for_women() throws Throwable {
		
		POJO1 pm = new POJO1();
		
		fill(pm.getSrch(), "bags for women");
		
		Robot rt = new Robot();
		
		rt.keyPress(KeyEvent.VK_ENTER);
		
		rt.keyRelease(KeyEvent.VK_ENTER);
	   
	}

	@Then("List of bags appeared")
	public void list_of_bags_appeared() {
		
		
		Set<String> st = new  HashSet<String>();
		
        List<WebElement> bags = Hook.driver.findElements(By.xpath("//a[@class='name-link']"));	
        
        
        for(WebElement x : bags) {
        	
        	String name = x.getText();
        	
        	System.out.println(name);
        	
        	
        	Assert.assertEquals(name.contains("Women's L.L Bean"), "Women's L.L Bean");
        	
        	
        	
        }
        
       
        
        
      
        
        
        
	}





}
