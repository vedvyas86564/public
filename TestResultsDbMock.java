package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.components.applicant.inforetriever.converter.dto.DbTestResultDto;
import com.org.dl.components.applicant.inforetriever.converter.dto.mock.TestResultMock;

import java.util.ArrayList;
import java.util.List;

public class TestResultsDbMock {
 
    public DbTestResultsSet getDBMock() {
        CreateTestResultsMock created = new CreateTestResultsMock();
//        TestResultMock mock = created.getMock();
        List<DbTestResultDto> testResults = new ArrayList<>();
        testResults.add(TestResultMock.getDrivingTestResults1());
        testResults.add(TestResultMock.getDrivingTestResults2());
        testResults.add(TestResultMock.getVisionTestMock1());
        testResults.add(TestResultMock.getVisionTestMock2());
        testResults.add(TestResultMock.getWrittenTestMock1());
        testResults.add(TestResultMock.getWrittenTestMock2());
        DbTestResultsSet set = new DbTestResultsSet();
        set.setTestResults(testResults);
        return set;
    }
}
