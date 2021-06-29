package batch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

public static void main(String[] args) throws IOException  {
	// TODO Auto-generated method stub
	Properties prop=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\ramr1\\Desktop\\Batch14\\batch14\\config.properties");
	prop.load(file);
	String browser=prop.getProperty("browser");
	System.out.println(browser);
}
	




}
