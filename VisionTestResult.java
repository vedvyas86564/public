package com.org.dl.bo;

import java.util.Date;
import java.util.Objects;

public class VisionTestResult extends TestResult {
    private boolean correctiveLensesRequired;

    public VisionTestResult(Result result, Date dateTaken, float timeTaken, boolean correctiveLensesRequired) {
        super(result, dateTaken, timeTaken);
        this.correctiveLensesRequired = correctiveLensesRequired;
    }

    public boolean isCorrectiveLensesRequired() {
        return correctiveLensesRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisionTestResult that = (VisionTestResult) o;
        return correctiveLensesRequired == that.correctiveLensesRequired;
    }

    @Override
    public int hashCode() {
        return Objects.hash(correctiveLensesRequired);
    }

    @Override
    public String toString() {
        return "VisionTestResult{" +
                "correctiveLensesRequired=" + correctiveLensesRequired +
                '}';
    }

}
