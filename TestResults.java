package com.org.dl.bo;

import java.util.ArrayList;
import java.util.List;

// Composite Design pattern's composite class
public class TestResults {
    private List<TestResult> testResults;

    public TestResults() {
        testResults = new ArrayList<>();
    }

    public void add(TestResult testResult) {
        testResults.add(testResult);
    }

    //adding methods that return and change values to a DTO is bad becuase
    //a DTO is simply a data transfer object, it should not have any businesss logic
    public List<VisionTestResult> getVisionTests() {
        List<VisionTestResult> visionTestResults = new ArrayList<>();
        for (TestResult tr : testResults) {
            if (tr instanceof VisionTestResult) {
                visionTestResults.add((VisionTestResult) tr);
            }
        }
        return visionTestResults;
    }

    public List<WrittenTestResult> getWrittenTests() {
        List<WrittenTestResult> writtenTestResults = new ArrayList<>();
        for (TestResult tr : testResults) {
            if (tr instanceof WrittenTestResult) {
                writtenTestResults.add((WrittenTestResult) tr);
            }
        }
        return writtenTestResults;
    }

    public List<DrivingTestResult> getDrivingTests() {
        List<DrivingTestResult> drivingTestResults = new ArrayList<>();
        for (TestResult tr : testResults) {
            if (tr instanceof DrivingTestResult) {
                drivingTestResults.add((DrivingTestResult) tr);
            }
        }
        return drivingTestResults;
    }

    @Override
    public String toString() {
        return "TestResults{" +
                "testResults=" + testResults +
                '}';
    }
// todo: equals, hashcode, toString

}
