package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features= "C:\\Users\\goldi\\eclipse-workspace\\Selenium\\src\\test\\java\\Features\\Google.feature",
					glue="StepDefinitions",
					dryRun = false)
public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	
}
