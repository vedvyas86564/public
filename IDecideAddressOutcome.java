package com.org.dl.decidingOutcomes;

import com.org.dl.bo.Address;
import com.org.dl.bo.TestResult;

public interface IDecideAddressOutcome {
    public TestOutcome decide(Address address);
}
