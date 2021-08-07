package batch14;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElementsLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("https://book.spicejet.com/Login.aspx");
		
		
		List<WebElement>elesss=driver.findElements(By.xpath("//div/ul/li"));
				for(WebElement s:elesss) {
					System.out.println(s.getText());
				}
		
		
		
//		
//		//WebElement ele=driver.findElement(By.className("wHuge4s2country-mobilecountry-mobile-loginrequired"));
//		WebElement el1=driver.findElement(By.cssSelector("input[class='wHuge4s2 country-mobile country-mobile-login required']"));
//		
//		//ele.sendKeys("Rekhakathayat94@gmail.com");
//		
//		el1.sendKeys("enterIserid");
//		
//		
//		
//		
//		
//		String linkT=driver.findElement(By.linkText("DEALS")).getText();
//		String partiall=driver.findElement(By.partialLinkText("SPICECL")).getText();
//		
//		System.out.println(linkT);
//		System.out.println(partiall);
//		List<WebElement>eles=driver.findElements(By.tagName("a"));

	}

}
