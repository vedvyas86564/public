package com.org.dl.components.applicant.inforetriever.converter.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class SsnDto implements Serializable {

    private static final long serialVersionUID = -2561954822331049932L;
    private String social;
    private Date date;
    private String city;
    private String county;
    private String officeCode;
    private String employee;
    private Date expiryDate;

    public SsnDto(String social, Date date, String city, String county, String state, String officeCode, String employee, Date expiryDate) {
        this.social = social;
        this.date = date;
        this.city = city;
        this.county = county;
        this.officeCode = officeCode;
        this.employee = employee;
        this.expiryDate = expiryDate;
    }

    public String getSocial() {
        return social;
    }

    public Date getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public String getEmployee() {
        return employee;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "SSNDTO{" +
                "social='" + social + '\'' +
                ", date='" + date + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", officeCode='" + officeCode + '\'' +
                ", employee='" + employee + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsnDto ssndto = (SsnDto) o;
        return Objects.equals(social, ssndto.social) && Objects.equals(date, ssndto.date) && Objects.equals(city, ssndto.city) && Objects.equals(county, ssndto.county) && Objects.equals(officeCode, ssndto.officeCode) && Objects.equals(employee, ssndto.employee) && Objects.equals(expiryDate, ssndto.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(social, date, city, county, officeCode, employee, expiryDate);
    }
}
