package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[]args){
        ResidentialProperty alpha = new ResidentialProperty(
                "Alpha", 123, ResidentialProperty.Type.TOWNHOME,4000);

        System.out.println(alpha);
        System.out.println();


        CommercialProperty gama = new CommercialProperty(
                "Alpha", 123, CommercialProperty.Type.INDUSTRIAL,4000);

        System.out.println(gama);
        System.out.println();


        Property epsilon = new Property("Plot", "Epsilon",1600);
        System.out.println(epsilon);

        System.out.println();

    }
}
