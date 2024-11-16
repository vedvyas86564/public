package com.org.dl.decidingOutcomes;

import com.org.dl.bo.TestResults;

interface IDecide <I2> {
    //public void setNextChain();
    TestOutcome decide(I2 testResults);
    boolean hasValidDate(I2 testResult);

}
