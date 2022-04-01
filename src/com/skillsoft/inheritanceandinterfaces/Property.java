package com.skillsoft.inheritanceandinterfaces;

import java.util.Arrays;

public class Property {

    private final String propertyType;
    private final long id ;
    private final String projectName;
    private final int propertySize;


    {
        id= Math.round(Math.random()* 10000);
    }

    public Property(String propertyType, String projectName, int propertySize){


        this.propertyType=propertyType;
        this.projectName=projectName;
        this.propertySize=propertySize;


    }

    @Override
    public  String toString(){
        return String.format("Property {type=%s, id:%d projectName=%s, propertySize=%s}",
                propertyType,id,projectName,propertySize);
    }

}
