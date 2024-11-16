package com.org.dl.bo;

import java.util.Objects;

public class Inspector {
    private String inspectorName;
    private String inspectorCredits;
    private int yearsTraining;

    public Inspector(String inspectorName, String inspectorCredits, int yearsTraining) {
        this.inspectorCredits = inspectorCredits;
        this.inspectorName = inspectorName;
        this.yearsTraining = yearsTraining;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public String getInspectorCredits() {
        return inspectorCredits;
    }

    public int getYearsTraining() {
        return yearsTraining;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inspector that = (Inspector) o;
        return yearsTraining == that.yearsTraining && Objects.equals(inspectorName, that.inspectorName) && Objects.equals(inspectorCredits, that.inspectorCredits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inspectorName, inspectorCredits, yearsTraining);
    }

    @Override
    public String toString() {
        return "InspectorInformation{" +
                "inspectorName='" + inspectorName + '\'' +
                ", inspectorCredits='" + inspectorCredits + '\'' +
                ", yearsTraining=" + yearsTraining +
                '}';
    }
}
