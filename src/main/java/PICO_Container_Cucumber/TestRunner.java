package PICO_Container_Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src\\test\\java\\PICO_Container_Cucumber\\Test_PicoContainer.feature",
        glue = "PICO_Container_Cucumber",
        plugin = {"pretty", "html:target/cucumber.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
