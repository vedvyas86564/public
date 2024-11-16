package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.bo.CriminalRecord;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class CriminalRecordResultSet implements Serializable {
    @Serial
    private static final long serialVersionUID = -4529049232070448623L;
    private List<CriminalRecord> dtoList;

    public void setDtoList(List<CriminalRecord> dtoList) {
        this.dtoList = dtoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriminalRecordResultSet that = (CriminalRecordResultSet) o;
        return Objects.equals(dtoList, that.dtoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dtoList);
    }

    @Override
    public String toString() {
        return "CriminalRecordResultSet{" +
                "dtoList=" + dtoList +
                '}';
    }
}
