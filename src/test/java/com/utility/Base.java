package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.step.Hook;

public class Base {
	
	public static void launch(String s) {
		
		Hook.driver.get(s);
		
		
	}
	
	
	
	public static void fill(WebElement w , String s) {
		
		
		w.sendKeys(s);
		
		
	}
	
	
	
	public static void clk(WebElement w) {
		
		
		w.click();
		
	}
	
	
	public static List<HashMap<String,String>> exclRead() throws Throwable {
		
		
		List<HashMap<String,String>> li = new LinkedList<HashMap<String, String>>();
		
		File f = new File("D:\\Photon\\Day1Practice\\Excel\\ExcelInt.xlsx");
		
		FileInputStream str = new FileInputStream(f);
		
		Workbook wk = new XSSFWorkbook(str);
		
		Sheet sht = wk.getSheet("Sheet1");
		
		Row r1 = sht.getRow(0);
		
		for(int i=1; i<sht.getPhysicalNumberOfRows(); i++) {
			
			
			Row rw = sht.getRow(i);
			
			
			HashMap<String, String> mp = new HashMap<String, String>();
			
			
			for(int j=0; j<rw.getPhysicalNumberOfCells(); j++) {
				
				
				Cell cl = rw.getCell(j);
				
				int type = cl.getCellType();
				
				if(type==1) {
					
					
					String name = cl.getStringCellValue();
					
					mp.put(r1.getCell(j).getStringCellValue(), name);
					
					
					
				}
				
				else if(type==0) {
					
					double db = cl.getNumericCellValue();
					
					long l = (long)db;
					
				String name = String.valueOf(l);
				
				mp.put(r1.getCell(j).getStringCellValue(), name);
					
					
					
					
					
						
				}
				
				
				li.add(mp);
				
				
				
			}
			
			
			
			
		}
		return li;
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
