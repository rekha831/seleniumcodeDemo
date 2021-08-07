package batch14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitExplicitFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("https://book.spicejet.com/Login.aspx");
		
		//wait for a certain amount of time before it throws a "No Such Element Exception"
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Explicit wait
		// it can be applied only for specified elements
		WebElement userId=driver.findElement(By.id("txtUsername"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("userId")));
		driver.findElement(By.id("txtUsername")).sendKeys("rekhakathayat94@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("Rekha@2407");	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Fluent wait
		/*
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
       .withTimeout(30, SECONDS)
       .pollingEvery(5, SECONDS)
       .ignoring(NoSuchElementException.class);
       
       WebElement foo = wait.until(new Function<WebDriver, WebElement>() 

		 */
	

	}

}
