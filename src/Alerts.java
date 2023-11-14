import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Rahul";
		System.setProperty("webdriver.chrome.driver", "D://Users//Youssef//Desktop//Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		dddedeffefef
feefefeffeef
efef
efef
feeffe
effe
fe
feef
ef


{



}
public void(){

}
		driver.findElement(By.cssSelector("[id=alertbtn]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("[id=confirmbtn]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
