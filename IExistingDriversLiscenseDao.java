package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.components.applicant.inforetriever.converter.dto.ExistingDriversLiscenseDto;

import java.util.List;

public interface IExistingDriversLiscenseDao {
    public List<ExistingDriversLiscenseDto> getAll(String uri);

}
