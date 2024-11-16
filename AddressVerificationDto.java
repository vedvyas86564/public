package com.org.dl.components.applicant.inforetriever.converter.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class AddressVerificationDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -6873924721822277530L;
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressVerificationDto that = (AddressVerificationDto) o;
        return zipcode == that.zipcode && isValid == that.isValid && Objects.equals(type, that.type) && Objects.equals(address, that.address) && Objects.equals(county, that.county) && Objects.equals(city, that.city) && Objects.equals(state, that.state) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, address, zipcode, county, city, state, country, isValid);
    }

    private String address;
    private int zipcode;
    private String county;
    private String city;
    private String state;
    private String country;

    private boolean isValid;


    public AddressVerificationDto(String type, String address, String county, String city, String state, String country, int zipcode, boolean isValid) {
        this.type = type;
        this.address = address;
        this.country = country;
        this.county = county;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.isValid = isValid;
    }
    public String getType() {return type;
    }
    public String getAddress() {
        return address;
    }

    public String getCounty() {
        return county;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "AddressVerificationDto{" +
                "address='" + address + '\'' +
                ", county='" + county + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public int getZipcode() {
    return this.zipcode;
    }

    public boolean isValid() {
        return this.isValid;
    }
}
