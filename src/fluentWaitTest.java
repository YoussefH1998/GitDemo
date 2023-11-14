import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Users//Youssef//Desktop//Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
	
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).
								withTimeout(Duration.ofSeconds(30)).
								pollingEvery(Duration.ofSeconds(3)).
								ignoring(NoSuchElementException.class);
		
		 WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 //in this case it will return it the element  is present but not visible so the final print statement will get us false
		    	 //return driver.findElement(By.cssSelector("[id='finish'] h4"));
		    	 
		    	//we can fix it by the following
		    	 if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
		    	 {
			    	 return driver.findElement(By.cssSelector("[id='finish'] h4"));

		    	 }
		    	 else
		    		 return null;
		     
		     }
		   });
		 System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}

}
