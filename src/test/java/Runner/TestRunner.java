package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features="src\\test\\resources\\Features", // Folder Of Feature File
		glue="Stepdefinitions", // Packages Of Stepdefinition
		snippets =SnippetType.CAMELCASE, //  To Avoid Underscore In Methods
		dryRun=false,  // To Generate If Any Missed Snippets without execution(true)/with execution(false)
//		tags="not @invalidlogin"  // not or ~ will be used to avoid specific tag
		tags="@invalidlogin"  // not or ~ will be used to avoid specific tag
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}