package by.tc.task01.dao;

import java.util.*;

public class Criteria {
    final static String TYPE_OF_APPLIANCE="type"
    Map<String,String> parametr;


    public Criteria() {
        parametr=new HashMap<>();
    }
    public Criteria(String type){
        parametr=new HashMap<>();
        parametr.put(TYPE_OF_APPLIANCE,type);
    }
    public void addParametr(String key,String value){
        parametr.put(key,value);
    }
    public Set<Map.Entry<String,String>> getKeyValue(String key){
        Set<Map.Entry<String,String>> keyValue=parametr.entrySet();
        return keyValue;
    }
    public Collection<String> getValueByKey(String key){
        return  parametr.values();

    }
    public Set<String> getType(){
        return parametr.keySet();
    }



}
