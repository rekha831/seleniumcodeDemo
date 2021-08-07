package batch14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageOnloadAuthPop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String u = "admin";
		// adding username, password with URL
		// http://username:password@ipaddress/domainname
		String str = "https://" + u + ":" + u + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(str);
		Thread.sleep(5000);
		// identify and get text after authentication of popup
		String t = driver.findElement(By.tagName("p")).getText();
		Thread.sleep(5000);
		System.out.println("Text is: " +t);
		driver.quit();

	}

}
