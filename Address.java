package com.org.dl.bo;

import java.util.Objects;

public class Address {
    private Integer zipcode;
    private String streetName;
    private String streetType;
    private String state;

    public Address(Integer zipcode, String streetName, String streetType, String state) {
        this.zipcode = zipcode;
        this.streetName = streetName;
        this.streetType = streetType;
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return zipcode == address.zipcode && Objects.equals(streetName, address.streetName) && Objects.equals(streetType, address.streetType) && Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipcode, streetName, streetType, state);
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipcode=" + zipcode +
                ", streetName='" + streetName + '\'' +
                ", streetType='" + streetType + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
