package batch14;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("https://book.spicejet.com/Login.aspx");

		Thread.sleep(5000);
		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID"))
				.sendKeys("rekhakathayat94@gmail.com");
		driver.findElement(By.name("ControlGroupLoginView$MemberLoginView2LoginView$PasswordFieldPassword"))
				.sendKeys("Rekha@2407");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Actions act = new Actions(driver);

		// Clicking on flyouts
		System.out.println("Action class flyouts started");
		WebElement addon = driver.findElement(By.id("highlight-addons"));
		act.moveToElement(addon).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'You 1st')]")).click();
		Thread.sleep(5000);

		// Browser Actions
		System.out.println("Browser Action started");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().back();
		System.out.println("Browser Action ended");
		
		
		
		//Window Handles
		System.out.println("Window handle  started ");
		driver.findElement(By.xpath("//a[contains(text(),'SpiceShuttle')]")).click();
		
		Set<String> handles=driver.getWindowHandles();
		 
		 String parentWindow=driver.getWindowHandle();
		 System.out.println("parent"+parentWindow);
		 
		 Iterator<String> itr = handles.iterator();
		 while(itr.hasNext()){
			 String childWindow=itr.next();
			 driver.switchTo().window(childWindow);
			 System.out.println("child"+childWindow);
		 }
		 
		 
		 //isSelected()==>radio button is selected or not.
		 //isDisplayed()==>.checks radio button is displayed on the web page or not.
		 //isEnabled()==>radion button is enabled or not
		 
		 
		 //Dynamic web element and 
		 System.out.println("Dynamic web element started");
		WebElement oneWayRadio= driver.findElement(By.xpath("//input[@value='oneway']//parent::label/span[@class='checkmark']"));
		//oneWayRadio.click();
		Thread.sleep(15000);
		Boolean state1=oneWayRadio.isDisplayed();
		Boolean state2=oneWayRadio.isEnabled();
		Boolean state3=oneWayRadio.isSelected();
		
		
		System.out.println("the displayed status"+state1);
		System.out.println("the enable status"+state2);
		System.out.println("the selected or not status"+state3);
		
		//checking the status for disabled element
		WebElement onewayReturn=driver.findElement(By.xpath("//input[@id='datepicker2']"));
		Boolean retVal1=onewayReturn.isDisplayed();
		Boolean retVal2=onewayReturn.isEnabled();
		
		
		System.out.println("the displayed status"+retVal1);
		System.out.println("the enable status"+retVal2);
		
		
		
		
		
		driver.close();

		
		

		driver.quit();
	}

}
