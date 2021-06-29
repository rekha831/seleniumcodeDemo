package batch14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPointsAndBrowserActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver","C:\\batch14\\chromedriver.exc");
		driver.get("https://www.selenium.dev/");
	
		//Checkpoints
		//By page Title
		String pageTitle=driver.getTitle();
		System.out.println("the title is"+pageTitle);
		
		//By page URL
		String url=driver.getCurrentUrl();
		System.out.println("the URL is"+url);
		
		//Text checkpoint
		String actualTextCheckPoint=driver.findElement(By.xpath("//strong[text()='BLACK LIVES MATTER']")).getText();
		
		
		
	//	BrowserActions
		driver.findElement(By.xpath("//a[text()='David Burns']")).click();
		Thread.sleep(5000);
		
		//Back()
		driver.navigate().back();
		Thread.sleep(5000);
		
		
	//forward()
		driver.navigate().forward();
		Thread.sleep(3000);
		
		
		//refresh()
		driver.navigate().refresh();
		Thread.sleep(3000);
		
	}

}
