package com.org.dl.components.applicant.inforetriever.converter.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class CriminalRecordDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 8268515770434705197L;
    private String type;
    private String description;
    private Date when;
    private boolean revoked;

    public CriminalRecordDto(String type, String description, Date when, boolean revoked) {
        this.type = type;
        this.description = description;
        this.when = when;
        this.revoked = revoked;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Date getWhen() {
        return when;
    }

    public boolean isRevoked() {
        return revoked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriminalRecordDto crRecord = (CriminalRecordDto) o;
        return revoked == crRecord.revoked && Objects.equals(type, crRecord.type) && Objects.equals(description, crRecord.description) && Objects.equals(when, crRecord.when);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, description, when, revoked);
    }

    @Override
    public String toString() {
        return "CRRecord{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", when=" + when +
                ", revoked=" + revoked +
                '}';
    }
}
