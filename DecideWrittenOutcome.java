package com.org.dl.decidingOutcomes;

import com.org.dl.bo.TestResults;
import com.org.dl.bo.WrittenTestResult;
import com.org.dl.extractors.ExtractWrittenTestResult;
import com.org.dl.extractors.ExtractWrittenTestResults;

import java.util.Calendar;
import java.util.Date;

public class DecideWrittenOutcome implements IDecide<WrittenTestResult> {
//    public TestOutcome decide(ExtractWrittenTestResults extract, TestResults testResults) {
//        ExtractWrittenTestResult result = new ExtractWrittenTestResult();
//        WrittenTestResult writtenTestResult = result.extract(extract, testResults);
//        if(hasValidDate(writtenTestResult) &&  writtenTestResult.getActualScore() >= writtenTestResult.getMinScore() && writtenTestResult.getActualScore() < writtenTestResult.getMaxScore()) {
//            return TestOutcome.PASS;
//        }
//        else if(writtenTestResult.getActualScore() > writtenTestResult.getMaxScore()) {
//            return TestOutcome.UNAVAILABLE;
//        }
//        else {
//            return TestOutcome.FAIL;
//        }
//    }
public TestOutcome decide(WrittenTestResult writtenTestResult) {
        if(hasValidDate(writtenTestResult) &&  writtenTestResult.getActualScore() >= writtenTestResult.getMinScore() && writtenTestResult.getActualScore() < writtenTestResult.getMaxScore()) {
           return TestOutcome.PASS;
       }
      else if(writtenTestResult.getActualScore() > writtenTestResult.getMaxScore()) {
           return TestOutcome.UNAVAILABLE;
       }
      else {
           return TestOutcome.FAIL;
      }
    }

    public boolean hasValidDate(WrittenTestResult testResult) {
        Date todayDate = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(todayDate);
        calendar.add(Calendar.YEAR, -5);
        Date fiveYearsAgo = calendar.getTime();

        return testResult.getDateTaken().before(fiveYearsAgo) || testResult.getDateTaken().after(todayDate);
    }
}
