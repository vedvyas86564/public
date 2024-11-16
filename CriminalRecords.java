package com.org.dl.bo;

import java.io.Serializable;
import java.util.List;

public record CriminalRecords(List<CriminalRecord> crimes) implements Serializable {

}
