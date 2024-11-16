package com.org.dl.decidingOutcomes;

import com.org.dl.bo.CriminalRecord;
import com.org.dl.validation.ValidateCriminalRecord;

public class DecideCriminalOutcome {
    public TestOutcome criminalRecordClear(ValidateCriminalRecord criminalRecord, CriminalRecord record) {
        if(criminalRecord.recordIsCleared(record)) {
            return TestOutcome.PASS;
        }
        else if(!criminalRecord.recordIsCleared(record)) {
            return TestOutcome.FAIL;
        }
        return TestOutcome.UNAVAILABLE;
    }
    }

