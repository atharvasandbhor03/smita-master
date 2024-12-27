package ConvertintoTestng;

import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class datadriven_4_working_with_json {
	@Test
	public void task() throws EncryptedDocumentException, IOException, ParseException
	{
		FileReader rea=new FileReader("./foldernamedataupload/workingwithjson.json");
		JSONParser par=new JSONParser();
		Object obj=par.parse(rea);
		JSONObject jobj=(JSONObject)obj;
		Object value=jobj.get("Stream");
		System.out.println(value);

	}

}
