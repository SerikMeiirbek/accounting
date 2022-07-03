package com.cydeo.enums;

public enum Unit {

    PIECES("pieces"), KILOGRAM("kilogram"),METER("meter"), GALLON("gallon"),FEET("feet");

    private final String value;


    Unit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
