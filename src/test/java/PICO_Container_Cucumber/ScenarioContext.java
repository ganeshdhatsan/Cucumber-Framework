package PICO_Container_Cucumber;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
	 private final Map<String, Object> data;

	    public ScenarioContext() {
	        data = new HashMap<>();
	    }

	    public void set(String key, Object value) {
	        data.put(key, value);
	    }

	    public Object get(String key) {
	        return data.get(key);
	    }

	    public boolean containsKey(String key) {
	        return data.containsKey(key);
	    }
}
