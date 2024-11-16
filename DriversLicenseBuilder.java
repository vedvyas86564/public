package com.org.dl.driversLicenseInfo;

import com.org.dl.bo.Address;
import com.org.dl.bo.ApplicantActualInformation;
import com.org.dl.bo.VerifiedAddress;

public class DriversLicenseBuilder{
    private String name;
    private String height;
    private Address address;

    private int ID;

    public DriversLicenseBuilder(ApplicantActualInformation applicantActualInformation) {
    this.address = applicantActualInformation.address();
    this.name  = applicantActualInformation.name();
    this.height = applicantActualInformation.height();
    this.ID = applicantActualInformation.ID();
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public Address getAddress() {
        return address;
    }

public int getID(){
        return ID;
}
}
