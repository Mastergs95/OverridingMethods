package com.skillsoft.inheritandinterfaces;

public class IndustrialProperty extends Property{

    public IndustrialProperty(String projectName, int propertySize) {
        super("Industrial Property", projectName, propertySize);

    }

    public void printDetails(){
        System.out.println(getFormattedString());
    }
}
