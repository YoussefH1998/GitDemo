import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class testKnowledge {

	private static Object object;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Users//Youssef//Desktop//Selenium/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("TestUser");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Balabizo");
		driver.findElement(By.cssSelector("button[class*='signInBtn']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("newUser");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rere@taga.org");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("456765467");
		driver.findElement(By.xpath("//button[contains(@class,'pwd')]")).click();
		System.out.println(driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText());
		driver.findElement(By.xpath("//button[contains(@class,'go-to-login')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Nael");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[class*='signInBtn']")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		driver.findElement(By.xpath("//button[contains(@class,'logout')]")).click();
		Thread.sleep(4000);
		driver.close();


	}

}
