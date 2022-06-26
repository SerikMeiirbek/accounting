package com.cydeo.enums;

public enum InvoiceStatus {
    APPROVED("Approved"), PENDING("Pending");
    private final String value;
    InvoiceStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
