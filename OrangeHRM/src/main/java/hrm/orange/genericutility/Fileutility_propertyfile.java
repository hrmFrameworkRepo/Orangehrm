package hrm.orange.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class Fileutility_propertyfile {
	public String getdataFromPropertiesFile(String key) throws Exception
	{
		FileInputStream fis=new FileInputStream("./Property/Vtiger.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
		
	}
}
