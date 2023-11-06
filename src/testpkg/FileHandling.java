package testpkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandling 
{

	public static void readData() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Documents\\abc.txt");
		
		File f = new File("./Data/test.txt");  //file connection
		
		FileReader fr = new FileReader(f);
		
		fr.read();
		
		//FileReader fr = new FileReader("./Data/test.txt");
		
		int r = fr.read();  //84
		
		while(r!=-1)  //r=84, 104 , r=-1
		{
			System.out.print((char)r); // Th
			r=fr.read();  //104
		}
		
		
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./Data/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line");
		fw.flush();
		fw.close();
		
	}
	
	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./Data/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("name"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("automation"));
	}
	
	public static void main(String[] args) throws Exception
	{
		FileHandling.readprop();
		FileHandling.writedata();
	}
	
}
