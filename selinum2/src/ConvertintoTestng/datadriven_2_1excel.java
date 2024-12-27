package ConvertintoTestng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class datadriven_2_1excel  {
	
	// TODO Auto-generated constructor stub
	
	@Test
	public void task() throws EncryptedDocumentException, IOException
	{
		
FileInputStream fis=new FileInputStream("E:\\Selenium\\selinum2\\foldernamedataupload\\report.xlsx");
		
		Workbook wbook=WorkbookFactory.create(fis);
		Sheet sh1=wbook.getSheet("Sheet1");
		Row r1=sh1.getRow(2);
		Cell c1=r1.getCell(1);
		
		System.out.println(c1.getStringCellValue());//for string
		//System.out.println(c1.getNumericCellValue());//for numeric
	}



}
