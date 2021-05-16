package cucumber;

import enums.Context;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private Map<String, Object> scenarioContextMap;

    public ScenarioContext(){
        scenarioContextMap = new HashMap<>();
    }

    public void setScenarioContextMap(Context key, Object value){
        scenarioContextMap.put(key.toString(), value);
    }

    public Object getScenarioContextMap(Context key){
        return scenarioContextMap.get(key.toString());
    }

    public boolean isContains(Context key){
        return scenarioContextMap.containsKey(key.toString());
    }
}
