package ConvertintoTestng;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class datadriven_5_working_with_csv {
	
	@Test
	public void task() throws EncryptedDocumentException, IOException, ParseException, CsvException
	{
		FileReader file=new FileReader("./foldernamedataupload/csv.csv");
		CSVReader csv=new CSVReader(file);
		
		/*
		 *********to extract single row*************
		 
		String[] value=csv.readNext();
		for (String string : value) {
			System.out.println(string);
		}
		*/
	
		/**************** all rows from Table *****************/
		
	List<String[]>	ts=csv.readAll();
	for (String[] strings : ts) {
		for (String string :strings ) {
			System.out.println(string);
		}
	}

	}

}
