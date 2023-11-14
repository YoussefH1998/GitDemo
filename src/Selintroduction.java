import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
		//Chrome-- Chrome Driver extends WebDriver -->methods close get
		//FireFox-- FireFox Driver  -->methods close get
		//safari -- Safari Driver  -->methods close get

		//Invoking Browser

		//ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","D:/Users/Youssef/Desktop/Selenium/chromedriver.exe");

		//chrome driver.exe --> Chrome browser
		
		//remote--allow--origins
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("remote--allow--origins=*");
		
		//webdriver.chrome.driver-->value of path
		WebDriver driver=new ChromeDriver(options);*/
		
		//FireFox Launch
		//geckodriver
		/*
		 System.setProperty("webdriver.gecko.driver","D:/Users/Youssef/Desktop/Selenium/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 */
		
		//Microsoft Edge 
		System.setProperty("webdriver.edge.driver","D:/Users/Youssef/Desktop/Selenium/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//close only one tab
		driver.close();
		//use only close or quit not both
		//close all associated windows
		//driver.quit();
	}

}
