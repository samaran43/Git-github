package configs;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setupDetails {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup_001()
	{
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		//	driver = new ChromeDriver();
		ChromeOptions headLess = new ChromeOptions();
		headLess.addArguments("--headless");
		
		driver = new ChromeDriver(headLess);
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	}
