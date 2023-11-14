

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkLists {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Users//Youssef//Desktop//Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).isSelected());

		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

	}

}
