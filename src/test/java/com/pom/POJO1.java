package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.step.Hook;

public class POJO1 {
	
	
	public POJO1() {
		
		PageFactory.initElements(Hook.driver, this);
		
		
		
	}
	
	
	
	@FindBy(id="q")
	
	private WebElement srch;
	
	
	/*@FindBys({
		@FindBy(xpath="//input[@class='submitSearch btn btn-default']") ,
		
		@FindBy(xpath="//input[@type='submit']") 
	})
	*/
	
	

	public WebElement getSrch() {
		return srch;
	}
	
	
	
	

}
