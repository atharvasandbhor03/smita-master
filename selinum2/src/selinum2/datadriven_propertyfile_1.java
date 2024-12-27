package selinum2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class datadriven_propertyfile_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("E:\\Selenium\\selinum2\\foldernamedataupload\\empdata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		Object obj=pro.get("Emp_name");
		System.out.println(obj);
		String str=pro.getProperty("Salary");
		System.out.println(str);
	}

}
