package com.org.dl.decidingOutcomes;

import com.org.dl.bo.TestResults;
import com.org.dl.bo.VisionTestResult;
import com.org.dl.extractors.ExtractVisionTestResults;
import com.org.dl.extractors.ExtractVisionTestResult;

public class VisionTestResultPassOrFail implements IVisionTestResultPassOrFail {
    @Override
    public boolean pass(ExtractVisionTestResult testResult, ExtractVisionTestResults visionTestResults, TestResults testResults) {
        VisionTestResult curr = testResult.extract(visionTestResults, testResults);
        return "pass".equalsIgnoreCase(curr.getResult().getTitle());
    }
}
