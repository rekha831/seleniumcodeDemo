package batch14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmationPrompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("switching to alert");
		//1)get the text on the pop-up using get text
		//2)click on cancel using dismiss()
		//3)click on ok using accept ()
			
		Alert alt=	driver.switchTo().alert();
		String altMessage=alt.getText();
		System.out.println(altMessage);
		alt.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		alt.accept();
		alt.accept();
		

	}

}
