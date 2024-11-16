package com.org.dl.decidingOutcomes;

import com.org.dl.bo.Result;
import com.org.dl.bo.TestResults;
import com.org.dl.bo.VisionTestResult;
import com.org.dl.extractors.ExtractVisionTestResult;
import com.org.dl.extractors.ExtractVisionTestResults;

import java.util.Calendar;
import java.util.Date;

public class DecideVisionOutcome implements IDecide< VisionTestResult> {
    @Override
    public TestOutcome decide(VisionTestResult visionTestResult) {

        if(!hasValidDate(visionTestResult)) {
            return TestOutcome.UNAVAILABLE;
        }
        if(visionTestResult.getResult() == Result.PASS) {
            return TestOutcome.PASS;
        }
        if(visionTestResult.getResult() == Result.FAIL) {
            return TestOutcome.FAIL;
        }
        return null;
    }

    @Override
    public boolean hasValidDate(VisionTestResult testResult) {
//        Date todayDate = new Date();
//        int year = Year.now().getValue();
//        Calendar calendar = Calendar.getInstance();
//        int day = calendar.get(Calendar.DAY_OF_WEEK);
//        Date fiveYearsAgo = new Date(year-5, Calendar.MONTH, day);
//        return !(testResult.getDateTaken().before(fiveYearsAgo) || testResult.getDateTaken().after(todayDate));
        Date todayDate = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(todayDate);
        calendar.add(Calendar.YEAR, -5);
        Date fiveYearsAgo = calendar.getTime();

        return testResult.getDateTaken().before(fiveYearsAgo) || testResult.getDateTaken().after(todayDate);
    }
}
