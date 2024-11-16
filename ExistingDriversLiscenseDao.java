package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.components.applicant.inforetriever.converter.dto.ExistingDriversLiscenseDto;
import com.org.dl.components.applicant.inforetriever.converter.dto.mock.ExistingDriversLiscenseMock;

import java.util.ArrayList;
import java.util.List;

public class ExistingDriversLiscenseDao implements IExistingDriversLiscenseDao {
    private List<ExistingDriversLiscenseDto> liscences = new ArrayList<>();
    public ExistingDriversLiscenseDao() {
        CreateExistingDriversLiscenseMock created = new CreateExistingDriversLiscenseMock();
        ExistingDriversLiscenseMock mock = created.getMock();
        liscences.add(mock.getExistingDriversLiscenseDto1());

    }
    @Override
    public List<ExistingDriversLiscenseDto> getAll(String uri) {
        return null;
    }
}
