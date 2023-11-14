import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Users//Youssef//Desktop//Selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("[href='/nested_frames']")).click();
		//driver.switchTo().frame(0).switchTo().frame(1);
		driver.switchTo().frame(driver.findElement(By.cssSelector("[src='/frame_top']"))).switchTo().frame(driver.findElement(By.cssSelector("[src='/frame_middle']")));
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());

	}

}
