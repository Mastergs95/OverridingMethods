package com.skillsoft.inheritanceandinterfaces;

public class ResidentialProperty extends Property{

    public enum Type {
        SINGLE_FAMILY_HOME,
        CONDO,
        TOWNHOME
    }

        private Type residentialPropertyType = Type.CONDO;
        private float hoaFees;

        public ResidentialProperty(String projectName, int propertySize,
                                   Type residentialPropertyType, float hoaFees){

            super("Residential",projectName,propertySize);

            this.residentialPropertyType=residentialPropertyType;
            this.hoaFees=hoaFees;
        }

        @Override
        public void printDetails(){
            super.printDetails();

            System.out.format("Residential Property {type=%s, HOA Fees=%.1f}",
                    residentialPropertyType,hoaFees);
            System.out.println();
        }

    @Override
    public String toString(){
            String baseString=super.toString();
        return String.format("%s \nResidential Property {type=%s, HOA Fees=%.1f}",
               baseString, residentialPropertyType,hoaFees);
    }
}
