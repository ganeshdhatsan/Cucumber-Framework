package PICO_Container_Cucumber;

public class PicoContainerModule {
	private final ScenarioContext scenarioContext;

    public PicoContainerModule() {
        scenarioContext = new ScenarioContext();
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

}
