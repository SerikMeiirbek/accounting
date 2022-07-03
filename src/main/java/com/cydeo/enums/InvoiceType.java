package com.cydeo.enums;

public enum InvoiceType {
    SALE("Sale"), PURCHASE("Purchase");
    private final String value;
    InvoiceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
