package batch14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/search.aspx");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1025)", "");
		Thread.sleep(5000);
		//By element
	WebElement	ele=driver.findElement(By.xpath("//a[contains(text(),'Carriage of Live Animals')]"));
	js.executeScript("arguments[0].scrollIntoView();", ele);
	Thread.sleep(5000);
		driver.close();

	}

}
