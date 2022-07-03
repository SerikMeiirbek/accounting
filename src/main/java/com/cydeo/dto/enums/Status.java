package com.cydeo.dto.enums;

public enum Status {

    ACTIVE("active"), PASSIVE("passive");

     private final String value;
     Status(String value){
        this.value = value;
    }

    public String getValue(){
         return value;
    }

}
