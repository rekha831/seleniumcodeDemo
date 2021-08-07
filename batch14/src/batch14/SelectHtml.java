package batch14;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectHtml {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exc");
		driver.get("file:///C:/rekhaTuto/sample.html");
		
		//upload File
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\rekhaTuto\\AutomationSyllabus.docx");
		
		WebElement city=driver.findElement(By.id("city"));
		Select dd=new Select(city);

		Thread.sleep(5000);
		dd.selectByIndex(1);
		Thread.sleep(5000);
		dd.selectByValue("4");
		Thread.sleep(5000);
		dd.selectByVisibleText("Chicago");
		
		//to get all options in select dropdown
		List<WebElement> allOptions=dd.getOptions();
		int k=allOptions.size();
		System.out.println(k);
		for (int i = 0; i < k; i++) {
			// to get each element from list
			WebElement option=allOptions.get(i);
			String text=option.getText();
			// Print the text of each element4
			System.out.println(text);
		}
		
		//To get all selected options
		List<WebElement> allSelOptions=dd.getAllSelectedOptions();
		int l=allSelOptions.size();
		System.out.println(l);
		for (int i = 0; i < l; i++) {
			WebElement option=allOptions.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		WebElement cities=driver.findElement(By.id("cities"));
		Select dd1=new Select(cities);
		dd1.selectByIndex(2);
		Thread.sleep(5000);
		dd1.selectByValue("4");
		Thread.sleep(5000);
		dd1.selectByVisibleText("Chicago");
		
		//get all selected options
		System.out.println("multiselect print");
		List<WebElement> allOptions1=dd1.getAllSelectedOptions();
		int m=allOptions1.size();
		System.out.println(m);
		for (int i = 0; i < m; i++) {
			WebElement option=allOptions1.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		
		//Deselct for multi select
		Thread.sleep(5000);
		dd1.deselectByIndex(2);
		Thread.sleep(5000);
		dd1.deselectByValue("4");
		Thread.sleep(5000);
		dd1.deselectAll();
		driver.close();
	}

}
