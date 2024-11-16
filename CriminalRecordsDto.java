package com.org.dl.components.applicant.inforetriever.converter.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CriminalRecordsDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 5629685537610297906L;
    private List<CriminalRecordDto> crimes;

    public CriminalRecordsDto() {
       this(new ArrayList<>());
    }
    public CriminalRecordsDto(List<CriminalRecordDto> crimes) {
        this.crimes  = crimes;
    }

    public CriminalRecordDto get(int index) {
        return crimes.get(index);
    }
    public boolean isEmpty() {
            return crimes == null  || crimes.isEmpty();
    }
    public void add(CriminalRecordDto crime) {
        crimes.add(crime);
    }
    public List<CriminalRecordDto> getCrimes() {
        return crimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriminalRecordsDto that = (CriminalRecordsDto) o;
        return Objects.equals(crimes, that.crimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crimes);
    }
}
