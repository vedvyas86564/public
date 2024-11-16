package com.org.dl.components.applicant.inforetriever.converter.dto;

import java.util.Date;
import java.util.List;

public class DriversLicence {
    private String state;
    private Date startDate;
    private Date endDate;
    private List<Restrictions> restrictions;

    public DriversLicence(String state, Date startDate, Date endDate, List<Restrictions> restrictions) {
        this.state = state;
        this.startDate = startDate;
        this.endDate = endDate;
        this.restrictions = restrictions;
    }

}
