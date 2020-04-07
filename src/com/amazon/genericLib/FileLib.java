package com.amazon.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
/** this method is used to access the value of particular key from  properties file
 * 
 * @param Key
 * @return String
 */
	public String getPropertyKeyValue(String Key)
	{
		FileInputStream ip=null;
		Properties prop=null;
		try 
		{
			ip=new FileInputStream("G:\\seleniumScript\\AmazonAppliation\\src\\com\\tyss\\amzon\\testdata\\commandata.properties");
		
			prop=new Properties();
			prop.load(ip);
		} 
		
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return prop.getProperty(Key);
		 
	}
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String getExcelData(String sheetName, int rowNum, int cellNum)
	{
		FileInputStream ip = null;
		Workbook wb = null;
		try
		{
			ip = new FileInputStream("G:\\seleniumScript\\AmazonAppliation\\src\\com\\tyss\\amzon\\testdata\\Amazon.xlsx");
			wb = WorkbookFactory.create(ip);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		Sheet sh = wb.getSheet(sheetName);
		Cell c = sh.getRow(rowNum).getCell(cellNum);
		CellType cType = c.getCellType();
		
		if(cType.toString().equals("NUMERIC"))
		{
			int data = (int)c.getNumericCellValue();
			return String.valueOf(data);
		}
		else
		{
			String data = c.getStringCellValue();
			return data;
		}
		
	
	}
}
