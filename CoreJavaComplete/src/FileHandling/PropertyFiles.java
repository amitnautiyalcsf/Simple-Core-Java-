package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFiles {

	public static void main(String[] args) throws IOException 
	{
		Properties p = new Properties();
		/*
		 * OutputStream os = new FileOutputStream("dataConfig.properties");
		 * p.setProperty("url", "localhost:3306/student");
		 * p.setProperty("uname","root"); p.setProperty("pass", "manu");
		 * 
		 * p.store(os, null);
		 */
		
		InputStream is = new FileInputStream("dataConfig.properties");
		p.load(is);
		
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("pass"));
		
		
		p.list(System.out);
		
		
	}
}
