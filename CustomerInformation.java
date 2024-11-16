package com.org.dl.components.applicant.inforetriever.converter.dto;

import com.org.dl.bo.Address;

import java.util.Date;

public class CustomerInformation {
    private String name;
    private Date birthDate;
    private Address address;
    private Document document;
    private DriversLicence license;
    private String email;

    public CustomerInformation(String name, Date birthDate, Address address, Document document, DriversLicence license, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.document = document;
        this.license = license;
        this.email = email;
    }
}
