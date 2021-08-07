package batch14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("https://jqueryui.com/droppable/");
		
		
		WebElement frameName=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameName);
		
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));

		Actions action = new Actions(driver);
		WebElement sourceLocator = driver.findElement(By.id("draggable"));
		WebElement targetLocator = driver.findElement(By.id("droppable"));
		// dragAndDrop(source, target) method accepts two parameters source and locator.
		// used dragAndDrop method to drag and drop the source locator to target locator.
		Thread.sleep(3000);
		action.dragAndDrop(sourceLocator, targetLocator).build().perform();
		Thread.sleep(5000);
		//Actions builder = new Actions(driver);

		//Building a drag and drop action
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(sourceLocator)
		.moveToElement(targetLocator)
		.release(targetLocator)
		.build();

		//Performing the drag and drop action
		dragAndDrop.perform();
	}

}
