package batch14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunIEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\rekhaTuto\\drivers\\IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver();
		driver.get("https://www.spicejet.com/");
		

	}

}
