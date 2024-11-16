package com.org.dl.driversLicenseInfo;

import com.org.dl.bo.Address;
import com.org.dl.bo.VerifiedAddress;

import java.util.Date;

public class DriversLicense {
    private String name;
    private String height;
    private int ID;
    private Date expiryDate;
    private Address address;
    public DriversLicense(String name, String height, int ID, Date expiryDate, Address address) {
        this.name = name;
        this.height = height;
        this.ID = ID;
        this.expiryDate = expiryDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return "driversLicenseInfo.DriversLicense{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", ID=" + ID +
                ", expiryDate=" + expiryDate +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public int getID() {
        return ID;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public Address getAddress() {
        return address;
    }
}
