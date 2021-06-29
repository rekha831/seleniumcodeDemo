package batch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesHere {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Properties pro=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\ramr1\\Desktop\\Batch14\\batch14\\configuration.properties");

		pro.load(fi);
		
		String expectedBrowser=pro.getProperty("browser");
		System.out.println(expectedBrowser);
		
	}

}
