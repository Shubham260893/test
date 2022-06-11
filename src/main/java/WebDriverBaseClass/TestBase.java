package WebDriverBaseClass;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.ExcelReading;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void setupBrowser(String browser) throws InterruptedException, IOException
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		
		ChromeOptions opt = new ChromeOptions();
		 WebDriverManager.chromedriver().setup();
		 
		// driver= new RemoteWebDriver(new URL("http://localhost:4444"),opt);
	//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	driver= new ChromeDriver();
	//driver.manage().window().maximize();
	
		}
		if(browser.equalsIgnoreCase("firefox"))
		{

			FirefoxOptions fopt = new FirefoxOptions();
			
			
			WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		}
		driver.get("https://www.google.com");
	WebElement x= driver.findElement(By.xpath("//input[@name='q']"));
				x.sendKeys("Monika");
				
				driver.quit();
				
				ExcelReading e= new ExcelReading();
				e.ReadData("C:\\Users\\goldi\\eclipse-workspace\\Selenium\\src\\main\\java\\Utilities\\TestData.xlsx");
				
	//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	
	//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("fdsg")));
	
//	Wait<WebDriver> wait1= new FluentWait<WebDriver>(driver)
//			.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(InvalidSelectorException.class);
//	
//	//wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("\"//input[@name='vfg']\"")));
//	
//	TakesScreenshot ts= (TakesScreenshot)driver;
//	File source= ts.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(source, new File("C:\\Users\\goldi\\eclipse-workspace\\Selenium\\target\\screenshot"));
//	
//	Assert.assertEquals(1, 1,"Correct");
}
	
}
