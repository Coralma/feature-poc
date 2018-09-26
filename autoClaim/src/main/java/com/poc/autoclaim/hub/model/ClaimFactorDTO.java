package com.poc.autoclaim.hub.model;

import lombok.Data;

public class ClaimFactorDTO {

    private String factorName;
    private String factorValue;

    public String getFactorName() {
        return factorName;
    }

    public void setFactorName(String factorName) {
        this.factorName = factorName;
    }

    public String getFactorValue() {
        return factorValue;
    }

    public void setFactorValue(String factorValue) {
        this.factorValue = factorValue;
    }
}
