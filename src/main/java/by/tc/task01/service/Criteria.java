package by.tc.task01.service;

import java.util.*;

public class Criteria {
    final static String TYPE_OF_APPLIANCE = "type";
    Map<String, String> parametr;


    public Criteria() {
        parametr = new HashMap<>();
    }

    public Criteria(String type) {
        parametr = new HashMap<>();
        parametr.put(TYPE_OF_APPLIANCE, type);
    }

    public void addParametr(String key, String value) {
        parametr.put(key, value);
    }

    public List<String> getParameters() {
        List<String> parameterList=null;

        Set<String> set=parametr.keySet();
        for(String key:set){
            parameterList.add(key+"="+parametr.get(key));
        }

        return parameterList;
    }

    public Collection<String> getValueByKey(String key) {
        return parametr.values();

    }

    public String getType() {
        for (int i = 0; i < parametr.size(); i++) {
            if (parametr.get(TYPE_OF_APPLIANCE) != null) {
                return parametr.get(TYPE_OF_APPLIANCE);
            }
        }
        return  null;

    }
}
