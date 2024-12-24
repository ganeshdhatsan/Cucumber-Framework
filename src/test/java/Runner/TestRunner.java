package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features="src\\test\\resources\\Features", // Folder Of Feature File
		glue="Stepdefinitions", // Packages Of Stepdefinition
		snippets =SnippetType.CAMELCASE, //  To Avoid Underscore In Methods
		dryRun=false,  // To Generate If Any Missed Snippets without execution(true)/with execution(false)
//		tags="@checklogin"// feature level		
//		tags="@invalidloginsecondapproach" , // not or ~ will be used to avoid specific tag
//		tags="@uat"
//		tags="not @invalidlogin"  // not or ~ will be used to avoid specific tag
//		tags="@smoke or @regression"
//		tags="@smoke and @regression"
//		tags="@regression and not @uat"
		tags="(@smoke or @regression) and (not @tst1)"
/**
 * type 1: from Run as 
 * test
 * test -Dtest=com.example.tests.TestRunner
 * test -Dcucumber.filter.tags="@uat"		
 */

		/**
		 * type 2: from cmd
		 * cd project main path
		 * mvn test                                                                                  ----- To run all test cases
		 * mvn test -Dtest=com.example.tests.TestRunner                                              ----- to run specific test class(TestRunner.java)
		 * mvn test -Dcucumber.filter.tags="@integration"                                            ----- to run based on tags
		 * java -cp target/test-classes:target/dependency/* org.testng.TestNG -testclass TestRunner  ----- run as a java file
		 */

		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}