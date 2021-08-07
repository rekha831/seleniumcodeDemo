package batch14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropp {

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
    driver.get("https://jqueryui.com/droppable/");

	
	
		Actions a=new Actions(driver);  
    
    WebElement Framename = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
     driver.switchTo().frame(Framename);
     System.out.println("entered frame");
     
    // WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
     //driver.switchTo().frame(frame);
      
    WebElement Source=driver.findElement(By.id("draggable"));
    WebElement Dest=driver.findElement(By.id("droppable"));
    //Thread.sleep(5000);
a.dragAndDrop(Source, Dest).build().perform();
    // a.dragAndDrop(Source, Dest).build().perform();
     
     driver.switchTo().defaultContent(); //switch the control back to main webpage
     Thread.sleep(5000);
     driver.close();
     

}
}