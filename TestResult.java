package com.org.dl.bo;

import java.util.Date;

/**
 *
 */
public abstract class TestResult {
    private Result result;
    private Date dateTaken;
    private float timeTaken;

    protected TestResult() {

    }

    protected TestResult(Result result, Date dateTaken, float timeTaken) {
        this.result = result;
        this.dateTaken = dateTaken;
        this.timeTaken = timeTaken;
    }

    protected TestResult(Date dateTaken, float timeTaken) {
        this.dateTaken = dateTaken;
        this.timeTaken = timeTaken;
    }

    /**
     * The method isValid() is used to determine if the TestResult is valid or not using
     * the null object pattern. If the TestResult is Invalid, this method will be overridden
     * to return false.
     *
     * @return
     */
    public boolean isValid() {
        return true;
    }

    public Result getResult() {
        return result;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public float getTimeTaken() {
        return timeTaken;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "result=" + result +
                ", dateTaken=" + dateTaken +
                ", timeTaken=" + timeTaken +
                '}';
    }
}
