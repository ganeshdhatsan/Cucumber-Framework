package CucumberTheory;

public class Theory {
	
	/**
	 * 1.The Cucumber Framework is a Framework used for Behavior-Driven Development (BDD) Testing
	 * 2.It reduce the gap between technical teams (developers/testers) 
	 * and non-technical stakeholders (business analysts/product owners).
	 * 3.It  can be written in plain english, human-readable text using the Gherkin language.
	 * 4.It supports code reusability
	 */
	
	/**
	Advantages of the Cucumber Framework
	
	*1.Readable and Understandable:
	Feature files are written in plain English,It reduce the gap between 
	technical teams (developers/testers) 
	and non-technical stakeholders (business analysts/product owners).
	
	2.Collaboration-Friendly:
	Encourages communication between developers, testers, and business stakeholders.
	
	*3.Reusable Steps:
	Common steps across scenarios can be reused so reducing redundancy.
	
	4.Open Source Tool: Freely available
	
	5.Multi-Language Support:
	Works with multiple programming languages (Java, Python, Ruby, etc.).
	
	6.Supports multiple operating system (Windows,MAC,Linux)
*/
	
	/**
	 * TestNG Workflow
	 * 
	 * 1. Set Up TestNG
a.Add TestNG dependency to your project using a build tool like Maven or Gradle.
b.Add TestNG Pluggin in our IDE like Eclipse, IntelliJ.

2. Write Test Cases
Create a test class and annotate methods with TestNG annotations like:
@Test – Marks a method as a test method.
@BeforeMethod, @AfterMethod – Execute before or after each test method.
@BeforeClass, @AfterClass – Execute once before or after all methods in the class.
@BeforeSuite, @AfterSuite – Execute before or after all tests in the suite.

4.Write Automation Scripts inside the TestCases :
Integrate with tools like Selenium, Appium, or REST-assured for web, mobile, and API automation.

5. Create testng.xml File

6. Execute Tests
a.Run tests via:IDE (e.g., Run testng.xml or the test methods).
b.Command Line using testng testng.xml.Build tools like Maven (mvn test).

7. generate Reports(if external reports needs)
a.TestNG generates default HTML and XML reports after execution.
b.For advanced reporting, integrate libraries like Extent Reports or Allure.

8. Integrate with CI/CD(Jenkins)
a.Add TestNG to CI/CD pipelines for automated test execution (e.g., Jenkins, GitHub Actions).

	 */
	
		
	
	/**
	 * Choosing a Right Framework
The choice of framework depends on:
1.Client Requirements:Analyse Client Requirements Carefully
2.Application type :Web based, mobile, API
3.Tool Selection :{Selenium,Appium,Rest Assurred}
4.Programming language Selection: Language Selection (Java,Phythen,Ruby,C#)
5.Framwork Selection: TestNG,Cucumber,Phytest,Karate,Robot
6.Team Selection : Based on Tools & Language Expertise
7.CI/CD and scalability needs : Jenkins
Each tool has its strengths, and combining tools is often the best approach for comprehensive automation.
	 */
	
	/**
	 * Ghekin keywords
	 * 
	 * 1.Feature
	 * 2.Background
	 * 3.Scenario
	 * 4.Scenario Outline
	 * 5.Examples
	 * 6.Given
	 * 7.When
	 * 8.And
	 * 9.Then
	 * 10.But
	 */
	
	/**
	 * Hooks(Annotations):
1.Hooks are blocks of code in the Cucumber execution cycle. 
2.Used for setup and teardown(terminate) of the environment/Browser/URL before and after each scenario.

Types of Hooks :
1.Normal Hooks
@Before
@After
@BeforeStep
@AfterStep
2.Global Hooks
@BeforeAll
@AfterAll
3.Conditional Hooks/Tagged Hooks
@Before("@Login1")
@After()

*Note:
*we can implement multiple hooks annotation
*For Example , we can use @before ,many times

1. we can specify an explicit order for hooks execution
@Before(order = 10)
public void doSomething(){
    // Do something before each scenario
}
	 */
	
	/**
	 * Tags:
1.Tags are a great way to organise our features and scenarios.
2.To execute Features/Scenarios
3.Restricting hooks to execute the scenarios

How to use:
1.Tags are placed above a Feature,Scenario, Scenario Outline,Hooks and Examples.
2.Tags that are placed above a Scenario Outline will be inherited by Examples.

Ignoring scenarios using "not @smoke" or ~(tilde) like "~ @smoke"(Currently depricated):
You can tell Cucumber to ignore scenarios with a particular tag:
Ex:
@Smoke
@Smoke and not @Sanity
@Smoke and @Sanity (To Execute the scenarios which matches both the tags)
@Smoke or @Sanity (To Execute the scenarios which matches any one of the tags)
(@smoke or @ui) and (not @slow)
Ex :Using JUnit runner class:
@CucumberOptions(tags = "not @smoke")
public class RunCucumberTest {}

Tag expressions
A tag expression is an infix boolean expression. Below are some examples:

Expression	Description
@fast	Scenarios tagged with @fast
@wip and not @slow	Scenarios tagged with @wip that aren’t also tagged with @slow
@smoke and @fast	Scenarios tagged with both @smoke and @fast
@gui or @database	Scenarios tagged with either @gui or @database
For even more advanced tag expressions you can use parenthesis for clarity,
 or to change operator precedence:

(@smoke or @ui) and (not @slow)

	 */
	
	/**
	 * Data Tables:
	 * DataTable is automatically flattened to a List<String> 
	 * by Cucumber (using DataTable.asList(String.class)) before invoking the step definition.
Data tables from Gherkin can be accessed 
by using the DataTable object as the last parameter in a step definition. 
This conversion can be done either by Cucumber or manually.

Depending on the table shape as one of the following collections:
List<List<String>> table
List<Map<String, String>> table
Map<String, String> table
Map<String, List<String>> table
Map<String, Map<String, String>> table
 */
	
	/**
	 * PICO Container:
	 * It helps to share objects between step definition classes 
	 * and hooks without the need for global variables 
	 * or manually managing object instances.
	 * 
	 * 
Work Flow:
1.PICO Container automatically injects objects into step definitions
and hooks when they are defined as constructor parameters.

2.Objects can be shared across different step definition classes
and hooks by ensuring they are registered with PICO Container.
	 * 
	 * Advantages:

1.Reduces manual object creation.
2.Ensures cleaner and more maintainable test code.
3.Promotes reusability of components.
	 */
	
	/**
	 *Parralel Execution
	 */
	
	
	/**
	 * Note:
	 * 1.Scenario classes & methods
	 * 2.Cucumber will in order of precedence parse properties from system properties, 
	 * environment variables and the cucumber.properties file.
	 * 3.For example, if you are using Maven and want to run a subset of scenarios tagged with @smoke:
         mvn mvn test -Dcucumber.filter.tags="@smoke"
      *@CucumberOptions(tags = "@smoke and @fast")  
      *@CucumberOptions(tags = "not @smoke")
      *mvn test -Dcucumber.filter.tags="@smoke and @fast" 
         
         
Supported properties are:

cucumber.ansi-colors.disabled=  # true or false. default: false
cucumber.execution.dry-run=     # true or false. default: false
cucumber.execution.limit=       # number of scenarios to execute (CLI only).
cucumber.execution.order=       # lexical, reverse, random or random:[seed] (CLI only). default: lexical
cucumber.execution.wip=         # true or false. default: false.
cucumber.features=              # comma separated paths to feature files. example: path/to/example.feature, path/to/other.feature
cucumber.filter.name=           # regex. example: .*Hello.*
cucumber.filter.tags=           # tag expression. example: @smoke and not @slow
cucumber.glue=                  # comma separated package names. example: com.example.glue
cucumber.plugin=                # comma separated plugin strings. example: pretty, json:path/to/report.json
cucumber.object-factory=        # object factory class name. example: com.example.MyObjectFactory
cucumber.snippet-type=          # underscore or camelcase. default: underscore
Note that the filter options cucumber.filter.name and cucumber.filter.tags are combined using an and operation. In other words, both expressions need to match.
	 * 
	 */
	
	/**
	 * Folder Structure:
src/main/java
    ├── utilities            // Utility classes (e.g., WebDriverManager, ConfigReader)
    ├── base                 // Base classes (e.g., TestBase)
src/test/java
    ├── stepDefinitions      // Cucumber Step Definitions
    ├── hooks                // Cucumber Hooks
    ├── runners              // TestNG or Cucumber Runners
    ├── reports              // Test Reports (e.g., Extent Reports)
    ├── POM             
    └── Page Object Manager 
src/test/resource
    ├── features             // Cucumber Feature Files
    └── data                 // Test Data (e.g., JSON, Excel)
    
    --- properties file (credentials)
    --- yaml file(Role & Env)

	 */
	

	/**
	 * Cucumber Workflow
	 * 
1. Set Up Cucumber
a.Add Cucumber dependency to your project using a build tool like Maven or Gradle.
b.Add Cucumber Pluggin in our IDE like Eclipse, IntelliJ.

2. Utilities
Create Reusable Methods

3.Create a Feature File:
Write high-level requirements in a structured, natural language.

4. Page Object Model
Maintain Page Objects/Webelements and Corresponding Methods

5. Page Object Manager
Maintain Objects for page Classes

6A.Create Step Definitions for the corresponding feature file:
Map each Gherkin step to code logic.

6B.Write Automation Scripts inside the Step Definitions :
Call methods from Page object model
(Integrate with tools like Selenium, Appium, or REST-assured for web, mobile, and API automation.)

7A.Execute Runner Class:
TestNG:
Extends AbstractTestNgCucumberTests
Add @CucumberOptions()

JUnit:
Add @RunWith(Cucumber.class)
Add @CucumberOptions()


7B.Execute Tests:
Execute using the runner class or a build tool like Maven/Gradle.

8.Generate Reports:
Use reporting plugins (e.g., HTML, JSON) for execution summaries.

9. Integrate with CI/CD(Jenkins)
a.Add TestNG to CI/CD pipelines for automated test execution (e.g., Jenkins, GitHub Actions).

--- properties file (User Credentials)
--- yaml/yml file(Role & Env)
	 */

	/**
	 * Dynamically Passing the Version
If you want to override the version dynamically (e.g., during a build), 
you can pass the version as a command-line argument using Maven:

mvn clean install -Dcucumber.version=7.15.0

<properties>
    <cucumber.version>7.14.0</cucumber.version> <!-- Define the version property -->
</properties>

<dependencies>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>${cucumber.version}</version> <!-- Use the version property here -->
        <scope>test</scope>
    </dependency>
</dependencies>

	 */

}
