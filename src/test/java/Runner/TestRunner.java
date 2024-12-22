package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features="src\\test\\resources\\Features", // Folder Of Feature File
		glue="Stepdefinitions", // Packages Of Stepdefinition
		snippets =SnippetType.CAMELCASE, //  To Avoid Underscore In Methods
		dryRun=true,  // To Generate If Any Missed Snippets without execution(true)/with execution(false)
		tags="@invalidlogin"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}