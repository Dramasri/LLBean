package com.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="D:\\Photon\\Day1Practice\\src\\test\\resources\\c1.feature", glue="com.step", plugin= {"json:target/cucumber-reports.json"})

public class TestRunner {
	
	
	@AfterClass
	
	public static void aftr() {
		
			JVMReport.jvmReport("D:\\Photon\\Day1Practice\\target\\cucumber-reports.json");
		
		
		
	}
	
	
	
	
}
