package com.org.dl.bo;

import java.util.Objects;

public class OfficeInformation {
    private Address officeAddress;
    private String name;
    private Integer code;

    public OfficeInformation(Address officeAddress, String name, Integer code) {
        this.officeAddress = officeAddress;
        this.name = name;
        this.code = code;
    }
    /*public OfficeInformation(String name){
        this(null, name,null);
    }*/

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficeInformation that = (OfficeInformation) o;
        return code == that.code && Objects.equals(officeAddress, that.officeAddress) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeAddress, name, code);
    }

    @Override
    public String toString() {
        return "OfficeInformation{" +
                "officeAddress=" + officeAddress +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
