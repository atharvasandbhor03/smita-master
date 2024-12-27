package selinum2;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class datadriven_working_with_csv_5 {

	public static void main(String[] args) throws IOException, CsvException {
		// TODO Auto-generated method stub
		
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
