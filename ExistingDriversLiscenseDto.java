package com.org.dl.components.applicant.inforetriever.converter.dto;

import java.util.Objects;

public class ExistingDriversLiscenseDto{
    private String endDate;
    private String stateIssued;
    private int driversLiscenseNumber;
    private String office;
    public ExistingDriversLiscenseDto(String endDate, String stateIssued, int driversLiscenseNumber, String office) {
        this.endDate = endDate;
        this.stateIssued = stateIssued;
        this.driversLiscenseNumber = driversLiscenseNumber;
        this.office = office;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStateIssued() {
        return stateIssued;
    }

    public int getDriversLiscenseNumber() {
        return driversLiscenseNumber;
    }

    public String getOffice() {
        return office;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExistingDriversLiscenseDto that = (ExistingDriversLiscenseDto) o;
        return driversLiscenseNumber == that.driversLiscenseNumber && Objects.equals(endDate, that.endDate) && Objects.equals(stateIssued, that.stateIssued) && Objects.equals(office, that.office);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endDate, stateIssued, driversLiscenseNumber, office);
    }

    @Override
    public String toString() {
        return "ExistingDriversLiscenseDto{" +
                "endDate=" + endDate +
                ", stateIssued='" + stateIssued + '\'' +
                ", driversLiscenseNumber=" + driversLiscenseNumber +
                ", office='" + office + '\'' +
                '}';
    }
}
