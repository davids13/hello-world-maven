package org.davids.com;

import java.util.Map;

public class Animal {

    private Map<String, Person> stringPersonMap;

    public Map<String, Person> getStringPersonMap() {
        return stringPersonMap;
    }

    public void setStringPersonMap(Map<String, Person> stringPersonMap) {
        this.stringPersonMap = stringPersonMap;
    }
}
