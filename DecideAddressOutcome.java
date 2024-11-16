package com.org.dl.decidingOutcomes;

import com.org.dl.bo.Address;

public class DecideAddressOutcome implements IDecideAddressOutcome{
    @Override
    public TestOutcome decide(Address address) {
        if(("california").equalsIgnoreCase(address.getState())) {
            return TestOutcome.PASS;
        }
        return TestOutcome.FAIL;
    }
}
