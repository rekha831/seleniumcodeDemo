package batch14;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlesndCalendrPopupToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("https://book.spicejet.com/Login.aspx");
		Thread.sleep(3000);
		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID"))
				.sendKeys("rekhakathayat94@gmail.com");
		Thread.sleep(3000);
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
			String parent = itr.next();
			String childWindow = itr.next();
			driver.switchTo().window(childWindow);
			System.out.println("child" + childWindow);
	
		
		 Thread.sleep(10000);
		System.out.println("the calender pop up by selecting");
		Thread.sleep(4000);

		WebElement cal = driver.findElement(By.id("datepicker1"));
		System.out.println("the calender pop up by send keys");
		cal.sendKeys("25/06/2021");

		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[text()='4']")).click();
		Thread.sleep(4000);

		// toolTip Pop UP

		// By title Attribute:
		WebElement tolTip = driver.findElement(By.xpath("(//i[@data-toggle='tooltip'])[1]"));
		String toltipVal = tolTip.getAttribute("data-original-title");
		System.out.println("the tooltip val is :" + toltipVal);
		// By title Attribute:<div>pop up val</div>
		// findelement==>getText();
		driver.quit();

	}

}
