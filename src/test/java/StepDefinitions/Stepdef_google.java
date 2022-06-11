package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef_google {
	
	@Given("Open browser")
	public void open_browser() {
		
		WebDriver driver= WebDriverManager.chromedriver().create();
	    
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	}

}
