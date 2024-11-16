package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.components.applicant.inforetriever.converter.dto.DbTestResultDto;
import com.org.dl.components.applicant.inforetriever.converter.dto.mock.TestResultMock;

import java.util.ArrayList;
import java.util.List;

public class TestResultsDbDao implements ITestResultsDbDao {
    private DbTestResultsSet testResults = new DbTestResultsSet();

    public TestResultsDbDao() {
        CreateTestResultsMock created = new CreateTestResultsMock();
//        TestResultMock mock = created.getMock();
        List<DbTestResultDto> list = new ArrayList<>();
        list.add(TestResultMock.getWrittenTestMock1());
        list.add(TestResultMock.getWrittenTestMock2());
        list.add(TestResultMock.getDrivingTestResults2());
        list.add(TestResultMock.getVisionTestMock1());
        testResults.setTestResults(list);

    }


    public DbTestResultsSet execute(String query) {
        return testResults;
    }
}
