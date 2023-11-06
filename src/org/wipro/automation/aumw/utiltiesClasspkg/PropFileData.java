package org.wipro.automation.aumw.utiltiesClasspkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropFileData 
{

	public static String readconfigprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./Data/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	
	public static String readelementprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./Data/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
}
