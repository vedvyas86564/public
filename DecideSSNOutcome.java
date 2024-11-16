package com.org.dl.decidingOutcomes;

public class DecideSSNOutcome implements IDecideSSNOutcome{
    @Override
    public TestOutcome decide(int SSN) {
        return TestOutcome.PASS;
    }
}
