package com.ecommerce.baseutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseUtilities {
	
	
	public static WebDriver driver;
	public static Properties properties;
	public static String primeWindow;

	@BeforeSuite
	public void loadPropertyFile() throws IOException {
		
		FileInputStream file=new FileInputStream("Config.properties");
		properties=new Properties();
		properties.load(file);

		String browser=properties.getProperty("Browser");
		String url=properties.getProperty("URL");

		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\JarviZ\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();

		}else if(browser.equalsIgnoreCase("firefox"))	{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\JarviZ\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");	
			driver=new FirefoxDriver();
		}	

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		primeWindow=driver.getWindowHandle();


	}
	@AfterSuite
	public void tearDown() {

		driver.quit();
	}

}
