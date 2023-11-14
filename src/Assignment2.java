import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Users//Youssef//Desktop//Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rahul@hotmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rahul@9848");
		driver.findElement(By.cssSelector(".form-check-input")).click();
		WebElement staticdropDown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(staticdropDown);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.cssSelector("#inlineRadio2")).click();
		driver.findElement(By.cssSelector("input[max='3000-12-31']")).sendKeys("205");
		driver.findElement(By.cssSelector("input[max='3000-12-31']")).sendKeys(Keys.RIGHT);
		driver.findElement(By.cssSelector("input[max='3000-12-31']")).sendKeys("1990");

		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	}

}
