import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Asssignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Users//Youssef//Desktop//Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String desiredText=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement dropDownList=driver.findElement(By.id("dropdown-class-example"));
		Select staticDropDown=new Select(dropDownList);
		staticDropDown.selectByVisibleText(desiredText);
		driver.findElement(By.id("name")).sendKeys(desiredText);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(5000);
		if(!driver.switchTo().alert().getText().contains(desiredText))
			System.out.println("Error");
		driver.switchTo().alert().accept();
			

		
	}

}
