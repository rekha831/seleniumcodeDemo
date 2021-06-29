package batch14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("https://book.spicejet.com/search.aspx");
		WebElement loginBtn=driver.findElement(By.id("Login"));
		Actions act = new Actions(driver);
		
		//ContextClick
		act.contextClick(loginBtn);
		Thread.sleep(5000);
	
		
		act.moveToElement(loginBtn).build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		
	
		
		WebElement memLogin=driver.findElement(By.xpath("//a[text()='Member Login']"));
		
		act.moveToElement(memLogin).build().perform();
		Thread.sleep(5000);
		memLogin.click();
		Thread.sleep(5000);
		

	}

}
