package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
	
	private FileInputStream fis;
	private File file;
	private XSSFWorkbook wb;
	private Sheet sheet;
	private Cell cell;
	private Row row;
	
	String excelpath ="C:\\Users\\goldi\\eclipse-workspace\\Selenium\\src\\main\\java\\Utilities\\TestData.xlsx";

	public void ReadData(String excelpath) throws EncryptedDocumentException, IOException
	{
		file= new File(excelpath);
		
		fis= new FileInputStream(file);
		
		wb= new XSSFWorkbook(fis);
				
		sheet= wb.getSheet("Sheet1");
		
		cell=sheet.getRow(1).getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
	}

}
