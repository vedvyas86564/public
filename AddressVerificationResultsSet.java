package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.components.applicant.inforetriever.converter.dto.AddressVerificationDto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class AddressVerificationResultsSet implements Serializable {
    @Serial
    private static final long serialVersionUID = -3640893110720834686L;

    private List<AddressVerificationDto> dtoList;

    public void setDtoList(List<AddressVerificationDto> dtoList) {
        this.dtoList = dtoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressVerificationResultsSet that = (AddressVerificationResultsSet) o;
        return Objects.equals(dtoList, that.dtoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dtoList);
    }

    @Override
    public String toString() {
        return "AddressVericationResultsSet{" +
                "dtoList=" + dtoList +
                '}';
    }
}
