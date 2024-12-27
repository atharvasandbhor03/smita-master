package selinum2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven_excel_2_using_forloop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("E:\\Selenium\\selinum2\\foldernamedataupload\\report.xlsx");
		
		Workbook wbook=WorkbookFactory.create(fis);
		Sheet sh1=wbook.getSheet("Sheet1");
		int rowcount=sh1.getPhysicalNumberOfRows();
		int cellcount=sh1.getRow(0).getPhysicalNumberOfCells();

		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				try //handle exception if any cell is empty
				{
			String value=sh1.getRow(i).getCell(j).toString();//for both common string as well as numeric data
			//String value=sh1.getRow(i).getCell(j).getStringCellValue();//for string data only
			//Double value=sh1.getRow(i).getCell(j).getNumericCellValue();//for numeric data only

			System.out.println(value);
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
