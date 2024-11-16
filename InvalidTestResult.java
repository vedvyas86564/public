package com.org.dl.bo;

import java.util.Date;

public class InvalidTestResult extends TestResult {

    public InvalidTestResult() {
        super();
    }

    protected InvalidTestResult(Result result, Date dateTaken, float timeTaken) {
        this();
    }

    protected InvalidTestResult(Date dateTaken, float timeTaken) {
        this();
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
