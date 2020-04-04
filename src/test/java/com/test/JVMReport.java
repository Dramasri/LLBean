package com.test;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void jvmReport(String json) {
		
		
		
		File f = new File("D:\\Photon\\Day1Practice\\target\\Reports");
		
		Configuration con = new Configuration(f, "Day1");
		
		con.addClassifications("Browser","chrome");
		
		con.addClassifications("sprint", "22");
		
		con.addClassifications("windows", "os");
		
		con.addClassifications("chrome", "80.0");
		
		List<String>  js = new LinkedList<String>();
		
		js.add(json);
		
		ReportBuilder rb = new ReportBuilder(js, con);
		
		rb.generateReports();
		
		
		
	}

}
