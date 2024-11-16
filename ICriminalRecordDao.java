package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.components.applicant.inforetriever.converter.dto.CriminalRecordsDto;

public interface ICriminalRecordDao {
    CriminalRecordsDto getAll(String uri);
    //public void delete(CriminalRecordsDto dto);
    //public void update(CriminalRecordsDto dto);
}
