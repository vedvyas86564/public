package com.org.dl.components.applicant.inforetriever.converter.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class DbTestResultDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 3616777852092154632L;
    private int maxScore;

    private int minScore;

    private int actualScore;

    private Date birthDate;
    private int zipcode;
    private String streetName;
    private String streetType;
    private String state;
    private float timeTaken;

    private String result;
    private int SSN;
    private String type;
    private String inspectorName;
    private String inspectorCredits;
    private int yearsTraining;
    private Date dateTaken;
    private String officeName;
    private int officeCode;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    private boolean correctiveLensesRequired;

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    public String getInspectorCredits() {
        return inspectorCredits;
    }

    public void setInspectorCredits(String inspectorCredits) {
        this.inspectorCredits = inspectorCredits;
    }

    public int getYearsTraining() {
        return yearsTraining;
    }

    public void setYearsTraining(int yearsTraining) {
        this.yearsTraining = yearsTraining;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public int getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(int officeCode) {
        this.officeCode = officeCode;
    }

    public int getZipcode() {
        return zipcode;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }

    public int getActualScore() {
        return actualScore;
    }

    public void setActualScore(int actualScore) {
        this.actualScore = actualScore;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(float timeTaken) {
        this.timeTaken = timeTaken;
    }

    public boolean isCorrectiveLensesRequired() {
        return correctiveLensesRequired;
    }

    public void setCorrectiveLensesRequired(boolean correctiveLensesRequired) {
        this.correctiveLensesRequired = correctiveLensesRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DbTestResultDto that = (DbTestResultDto) o;
        return maxScore == that.maxScore && minScore == that.minScore && actualScore == that.actualScore && zipcode == that.zipcode && Float.compare(that.timeTaken, timeTaken) == 0 && SSN == that.SSN && yearsTraining == that.yearsTraining && officeCode == that.officeCode && correctiveLensesRequired == that.correctiveLensesRequired && Objects.equals(birthDate, that.birthDate) && Objects.equals(streetName, that.streetName) && Objects.equals(streetType, that.streetType) && Objects.equals(state, that.state) && Objects.equals(result, that.result) && Objects.equals(type, that.type) && Objects.equals(inspectorName, that.inspectorName) && Objects.equals(inspectorCredits, that.inspectorCredits) && Objects.equals(dateTaken, that.dateTaken) && Objects.equals(officeName, that.officeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxScore, minScore, actualScore, birthDate, zipcode, streetName, streetType, state, timeTaken, result, SSN, type, inspectorName, inspectorCredits, yearsTraining, dateTaken, officeName, officeCode, correctiveLensesRequired);
    }

    @Override
    public String toString() {
        return "DbTestResult{" +
                "type='" + type + '\'' +
                ", inspectorName='" + inspectorName + '\'' +
                ", inspectorCredits='" + inspectorCredits + '\'' +
                ", yearsTraining=" + yearsTraining +
                ", dateTaken=" + dateTaken +
                ", officeName='" + officeName + '\'' +
                ", officeCode=" + officeCode +
                ", zipcode=" + zipcode +
                ", streetName='" + streetName + '\'' +
                ", streetType='" + streetType + '\'' +
                ", state='" + state + '\'' +
                ", timeTaken=" + timeTaken +
                ", correctiveLensesRequired=" + correctiveLensesRequired +
                '}';
    }
}
