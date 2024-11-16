package com.org.dl.decidingOutcomes;

import com.org.dl.bo.DrivingTestResult;
import com.org.dl.bo.Result;
import com.org.dl.bo.TestResults;
import com.org.dl.extractors.ExtractDrivingTestResult;
import com.org.dl.extractors.ExtractDrivingTestResults;
import com.org.dl.validation.ValidateInspector;

import java.util.Calendar;
import java.util.Date;

public class DecideDrivingOutcome implements IDecide<DrivingTestResult> {

    @Override
    public TestOutcome decide(DrivingTestResult drivingTestResult) {

        if(inspectorIsValid(drivingTestResult) && drivingTestResult.getResult() == Result.PASS && hasValidDate(drivingTestResult)) {
            return TestOutcome.PASS;
        }
        else if ((drivingTestResult.getResult() == null) || (drivingTestResult.getOffice() == null) || (drivingTestResult.getDateTaken() == null) || (drivingTestResult.getTimeTaken() < 0)) {
            return TestOutcome.UNAVAILABLE;
        } else {
            return TestOutcome.FAIL;
        }

    }

    public boolean inspectorIsValid(DrivingTestResult drivingTestResult) {
        ValidateInspector validateInspector = new ValidateInspector();
        return validateInspector.inspectorIsValid(drivingTestResult.getInspector());
    }

    public boolean hasValidDate(DrivingTestResult drivingTestResult) {
        Date todayDate = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(todayDate);
        calendar.add(Calendar.YEAR, -5);
        Date fiveYearsAgo = calendar.getTime();

        return drivingTestResult.getDateTaken().before(fiveYearsAgo) || drivingTestResult.getDateTaken().after(todayDate);
    }

}
