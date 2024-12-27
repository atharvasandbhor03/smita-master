package selinum2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven_write_back_to_excel_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("E:\\Selenium\\selinum2\\foldernamedataupload\\report.xlsx");
		Workbook wbook=WorkbookFactory.create(fis);
		Sheet sh1=wbook.getSheet("Sheet1");
		Row r1=sh1.getRow(2);
		Cell c1=r1.getCell(1);
		c1.setCellValue("xyz");
		String printsetdata=wbook.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(printsetdata);//it just change in virtual sheet here changes don't reflect in original sheet
		
		/*write or change data back to the original sheet*/
		FileOutputStream fos=new FileOutputStream("E:\\\\Selenium\\\\selinum2\\\\foldernamedataupload\\\\report.xlsx");
		wbook.write(fos);
		wbook.close();
		
	}

}
