package batch14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/search.aspx");
		
		//to perform Scroll on application using Selenium
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,1025)", "");
	       Thread.sleep(5000);
	       js.executeScript("window.scrollBy(0,-1025)", "");
	
	       
	       Thread.sleep(5000);
	       
	     //Locating element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.xpath("//td[text()='About Us']"));

	        // Scrolling down the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        
	        
	        Thread.sleep(5000);
	}

}
