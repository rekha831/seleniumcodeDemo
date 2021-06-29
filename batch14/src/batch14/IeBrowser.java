package batch14;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.ie.driver", "C:\\rekhaTuto\\drivers\\IEDriverServer.exe");
		   WebDriver driver=new InternetExplorerDriver();
		   driver.get("https://www.javatpoint.com/");
		   

		 List<WebElement> ele=driver.findElements(By.xpath("//div/ul//li/a"));
		 
		 for(int i=0;i<ele.size();i++) {
			System.out.println(ele.get(i).getText());
		 }
		   Thread.sleep(5000);
		   driver.close();

	}

}
