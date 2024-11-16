package com.org.dl.decidingOutcomes;

import com.org.dl.bo.TestResults;
import com.org.dl.extractors.ExtractVisionTestResults;
import com.org.dl.extractors.ExtractVisionTestResult;

public interface IVisionTestResultPassOrFail {
    boolean pass(ExtractVisionTestResult testResult, ExtractVisionTestResults visionTestResults, TestResults testResults);
}
