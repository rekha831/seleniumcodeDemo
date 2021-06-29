package batch14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("https://www.spicejet.com/");
		
		//Checkpoints
		//By page Title
		String pageTitle=driver.getTitle();
		System.out.println("the title is"+pageTitle);
		
		//By page URL
		String url=driver.getCurrentUrl();
		System.out.println("the URL is"+url);
		
		//Text checkpoint
		String actualTextCheckPoint=driver.findElement(By.xpath("//strong[text()='BLACK LIVES MATTER']")).getText();
		
		System.out.println("the title is"+pageTitle);
		System.out.println("the title is"+url);
		System.out.println("the title is"+actualTextCheckPoint);

	}

}
