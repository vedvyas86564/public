package com.org.dl.components.applicant.inforetriever.converter.dto;

import java.util.Date;
import java.util.Objects;

public class LegalPresenceDto {
    private String name;
    private Date birthDate;

    //we are going to convert the "type" number combination to information our DTO can understand
    //like USCitizenship and other information
    private String type;
    private String countryOfBirth;
    private String countryOfResidence;
    private String startDate;
    private String endDate;
    private String issuancePlace;
    private Date issuanceDate;

    public String getType() {
        return type;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getIssuancePlace() {
        return issuancePlace;
    }

    public Date getIssuanceDate() {
        return issuanceDate;
    }

    public LegalPresenceDto(String name, Date birthDate, String type, String countryOfBirth, String countryOfResidence, String startDate, String endDate, String issuancePlace, Date issuanceDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.type = type;
        this.countryOfBirth = countryOfBirth;
        this.countryOfResidence = countryOfResidence;
        this.startDate = startDate;
        this.endDate = endDate;
        this.issuancePlace = issuancePlace;
        this.issuanceDate = issuanceDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "LegalPresenceDto{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", type='" + type + '\'' +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", issuancePlace='" + issuancePlace + '\'' +
                ", issuanceDate=" + issuanceDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegalPresenceDto that = (LegalPresenceDto) o;
        return Objects.equals(name, that.name) && Objects.equals(birthDate, that.birthDate) && Objects.equals(type, that.type) && Objects.equals(countryOfBirth, that.countryOfBirth) && Objects.equals(countryOfResidence, that.countryOfResidence) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(issuancePlace, that.issuancePlace) && Objects.equals(issuanceDate, that.issuanceDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, type, countryOfBirth, countryOfResidence, startDate, endDate, issuancePlace, issuanceDate);
    }
}
