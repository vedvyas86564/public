package com.org.dl.bo;

import java.util.Objects;

public class Applicant {
    private int ssn;
    private String firstName;
    private String lastName;
    private int zipcode;
    private boolean isRevoked;
    private String typeOfCrime;
    private String height;
    public Applicant(int ssn, String firstName, String lastName, int zipcode, boolean isRevoked, String typeOfCrime, String height){
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipcode = zipcode;
        this.isRevoked = isRevoked;
        this.typeOfCrime = typeOfCrime;
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public int getSsn() {
        return ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getZipcode() {
        return zipcode;
    }

    public boolean isRevoked() {
        return isRevoked;
    }

    public String getTypeOfCrime() {
        return typeOfCrime;
    }

    public int getSSN() {
        return this.ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applicant applicant = (Applicant) o;
        return ssn == applicant.ssn && zipcode == applicant.zipcode && isRevoked == applicant.isRevoked && Objects.equals(firstName, applicant.firstName) && Objects.equals(lastName, applicant.lastName) && Objects.equals(typeOfCrime, applicant.typeOfCrime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn, firstName, lastName, zipcode, isRevoked, typeOfCrime);
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "ssn=" + ssn +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", zipcode=" + zipcode +
                ", isRevoked=" + isRevoked +
                ", typeOfCrime='" + typeOfCrime + '\'' +
                '}';
    }
}
