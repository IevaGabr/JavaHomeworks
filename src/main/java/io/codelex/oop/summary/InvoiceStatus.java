package io.codelex.oop.summary;

public enum InvoiceStatus {
    APPROVED("APPROVED"),
    SENT("SENT");

    private String name;

    InvoiceStatus(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
