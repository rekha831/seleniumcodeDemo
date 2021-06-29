package batch14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver","C:\\batch14\\chromedriver.exc");
		driver.get("https://www.spicejet.com/");
		driver.findElements(By.tagName("a"));
		
		driver.findElement(By.linkText("SPICECLUB")).getText();
		
		driver.findElement(By.partialLinkText("SPICECL"));
		
		//driver.findElement(By.cssSelector(cssSelector));
		
		// //htmltag[@attribute='attributeVal']
		
		//     html[attribute='attributeVal']
		
		

	}

}
