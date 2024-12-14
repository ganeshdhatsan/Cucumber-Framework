package PICO_Container_Cucumber;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitions {
	private final ScenarioContext scenarioContext;

    // PicoContainer automatically injects ScenarioContext
    public StepDefinitions(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }
    
    @Given("I add <{int}> and <{int}>")
    public void i_add_and(int a, int b) {
    	int result = a + b;
        scenarioContext.set("result", result);
    }
    @Then("the result should be <{int}>")
    public void the_result_should_be(int expected) {
    	int actual = (int) scenarioContext.get("result");
        assertEquals(expected, actual);
    }

}
