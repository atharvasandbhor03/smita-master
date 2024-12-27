package selinum2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven_excel_2_1 {
                                                                                                                     
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("E:\\Selenium\\selinum2\\foldernamedataupload\\report.xlsx");
		
		Workbook wbook=WorkbookFactory.create(fis);
		Sheet sh1=wbook.getSheet("Sheet1");
		Row r1=sh1.getRow(2);
		Cell c1=r1.getCell(1);
		
		System.out.println(c1.getStringCellValue());//for string
		//System.out.println(c1.getNumericCellValue());//for numeric


	}

}
