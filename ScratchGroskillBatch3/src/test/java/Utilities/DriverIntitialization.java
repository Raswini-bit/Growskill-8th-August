package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverIntitialization {
	public static WebDriver driver;
	public static String browserName=FetchDataFromProperty.readDataFromProperty().getProperty("browser");
	public static String URL=FetchDataFromProperty.readDataFromProperty().getProperty("url");
	
	@BeforeMethod()
	public static WebDriver getDriver()
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	

	

}
