package com.org.dl.bo;

public enum CrimeType {
    MURDER("Murder"),
    THEFT("Theft"),
    INSURANCE_FRAUD("Insurance Fraud"),
    ARSON("Arson"),
    ASSAULT("Assault"),
    OTHER("Other"),
    NONE("None");


    private final String type;

    CrimeType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }

    public static CrimeType get(String type) {
        CrimeType[] values = values();
        for (CrimeType value : values) {
            if(value.getType().equalsIgnoreCase(type)) {
                return value;
            }
        }
        return NONE;
    }
}
