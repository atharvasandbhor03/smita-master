package ConvertintoTestng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class datadriven_1_propertyfile {
	@Test
	public void task() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\Selenium\\selinum2\\foldernamedataupload\\empdata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		Object obj=pro.get("Emp_name");
		System.out.println(obj);
		String str=pro.getProperty("Salary");
		System.out.println(str);

	}

}
