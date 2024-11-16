package com.org.dl.bo;

import java.util.Date;
import java.util.Objects;

public class DrivingTestResult extends TestResult {
    private Inspector inspector;
    private OfficeInformation office;

    public DrivingTestResult(Result result, Inspector inspector, Date dateTaken, float timeTaken, OfficeInformation office) {
        super(result, dateTaken, timeTaken);
        this.inspector = inspector;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public OfficeInformation getOffice() {
        return office;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrivingTestResult that = (DrivingTestResult) o;
        return Objects.equals(inspector, that.inspector) && Objects.equals(office, that.office);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inspector, office);
    }

    @Override
    public String toString() {
        return "DrivingTestResult{" +
                "inspector=" + inspector +
                ", office=" + office +
                '}';
    }
}
