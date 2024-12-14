package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features="C:\\Users\\admin\\MASTER_GANESH\\Ganesh_Cucumber_Framework_Automation\\src\\test\\resources\\Features",
		glue="Stepdefinitions",
		snippets =SnippetType.CAMELCASE,
		dryRun=false
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
