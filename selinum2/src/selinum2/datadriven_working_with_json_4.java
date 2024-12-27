package selinum2;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class datadriven_working_with_json_4 {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		FileReader rea=new FileReader("./foldernamedataupload/workingwithjson.json");
		JSONParser par=new JSONParser();
		Object obj=par.parse(rea);
		JSONObject jobj=(JSONObject)obj;
		Object value=jobj.get("Stream");
		System.out.println(value);

	}

}
