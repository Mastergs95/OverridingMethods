package com.skillsoft.inheritandinterfaces;

public class Property {

    String propertyType;

    private long id ;
    private String projectName;
    private int propertySize;




    public Property(String propertyType, String projectName, int propertySize){

        id= Math.round(Math.random()* 10000);
        this.propertyType=propertyType;
        this.projectName=projectName;
        this.propertySize=propertySize;

    }

    public static Property getPropertyInstance(String propertyType, String projectName, int propertySize){

        return new Property(propertyType,projectName,propertySize);
    }

     int getPropertySize(){
        return propertySize;
    }

     String getProjectName(){
        return projectName;
    }

     String getPropertyType(){
        return propertyType;
    }

     long getId(){
        return id;
    }


     String getFormattedString(){
        return String.format("Property {type=%s, id:%d, projectName=%s, propertySize=%s}",
                propertyType,id,projectName,propertySize);
    }

    @Override
    public String toString(){
        return getFormattedString();
    }

}
