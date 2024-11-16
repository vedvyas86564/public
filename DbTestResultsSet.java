package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.components.applicant.inforetriever.converter.dto.DbTestResultDto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DbTestResultsSet implements Serializable {

    @Serial
    private static final long serialVersionUID = -3509006358813391258L;
    private List<DbTestResultDto> testResults;

    public List<DbTestResultDto> getTestResults() {
        return testResults;
    }

    public void setTestResults(List<DbTestResultDto> testResults) {
        this.testResults = testResults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DbTestResultsSet that = (DbTestResultsSet) o;
        return Objects.equals(testResults, that.testResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testResults);
    }

    @Override
    public String toString() {
        return "MyResultSet{" +
                "testResults=" + testResults +
                '}';
    }
}
