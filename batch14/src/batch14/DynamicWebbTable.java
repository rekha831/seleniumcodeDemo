package batch14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebbTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\batch14\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// *[@id="customers"]/tbody/tr[2]
		// *[@id="customers"]/tbody/tr[3]
		// *[@id="customers"]/tbody/tr[4]
		// *[@id="customers"]/tbody/tr[7]

		// *[@id="customers"]/tbody/tr[1]

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]

		String BefXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String aftXpath = "]";

		for (int i = 2; i <= 7; i++) {
			String actualVal = BefXpath + i + aftXpath;
			WebElement element = driver.findElement(By.xpath(actualVal));
			String ele = element.getText();
			System.out.println(ele);
		}
		System.out.println("=================================");

		String bxpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afXpath = "]/td[1]";
		List<WebElement> rowSize = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));

		String expectedval = "Island Trading";

		for (int i = 2; i <= rowSize.size(); i++) {
			String actxpath = bxpath + i + afXpath;
			WebElement ele = driver.findElement(By.xpath(actxpath));
			//System.out.println(ele.getText());

			if (ele.getText().equals(expectedval)) {
				System.out.println("found company :" + ele.getText());
			}
		}

	}

}
