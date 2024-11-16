package com.org.dl.bo;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

//Record is a concise form of an immutable DTO
//Record will automatically create a canonical constructor and use the parameters called compontents
//Records create final components so you cannot use setters
//Records will give you automatic getter methods and equals and hashcaode and toString()
//should basically only be used to create a DTO
public record CriminalRecord(Enum type, String description, Date when, boolean revoked) implements Serializable {
    @Serial
    private static final long serialVersionUID = 8268515770434705197L;

}
