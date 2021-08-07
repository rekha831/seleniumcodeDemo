package batch14;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("https://book.spicejet.com/Login.aspx");
		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID"))
				.sendKeys("rekhakathayat94@gmail.com");
		driver.findElement(By.name("ControlGroupLoginView$MemberLoginView2LoginView$PasswordFieldPassword"))
				.sendKeys("Rekha@2407");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Window Handles
		System.out.println("Window handle  started ");
		driver.findElement(By.xpath("//a[contains(text(),'SpiceShuttle')]")).click();

		Set<String> handles = driver.getWindowHandles();

		String parentWindow = driver.getWindowHandle();
		System.out.println("parent" + parentWindow);

		Iterator<String> itr = handles.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			driver.switchTo().window(childWindow);
			System.out.println("child" + childWindow);
		}

	}

}
