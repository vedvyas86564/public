package com.org.dl.bo;

import java.util.Date;
import java.util.Objects;

public class WrittenTestResult extends TestResult {
    private int maxScore;
    private int actualScore;
    private int minScore;

    public WrittenTestResult(int maxScore, int minScore, int actualScore, Date dateTaken, float timeTaken) {
        super(dateTaken, timeTaken);
        this.maxScore = maxScore;
        this.minScore = minScore;
        this.actualScore = actualScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public int getActualScore() {
        return actualScore;
    }

    public int getMinScore() {
        return minScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrittenTestResult that = (WrittenTestResult) o;
        return maxScore == that.maxScore && actualScore == that.actualScore && minScore == that.minScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxScore, actualScore, minScore);
    }

    @Override
    public String toString() {
        return "WrittenTestResult{" +
                "maxScore=" + maxScore +
                ", actualScore=" + actualScore +
                ", minScore=" + minScore +
                '}';
    }
}
