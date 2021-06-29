package batch14;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingithMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com/search.aspx");
	
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int k=allLinks.size();
		System.out.println(k);
		for (int i = 0; i < k; i++) {
			WebElement link=allLinks.get(i);
			String links=link.getAttribute("href");
			System.out.println(links);
			String text=link.getText();
			System.out.println(text);
		}


	}

}
