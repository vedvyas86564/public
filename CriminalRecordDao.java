package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.components.applicant.inforetriever.converter.dto.mock.CriminalRecordMock;
import com.org.dl.components.applicant.inforetriever.converter.dto.CriminalRecordsDto;

public class CriminalRecordDao implements ICriminalRecordDao {


    @Override
    public CriminalRecordsDto getAll(String uri) {
        CriminalRecordsDto records = new CriminalRecordsDto();
        records.add(CriminalRecordMock.getCriminalRecord1());
        records.add(CriminalRecordMock.getCriminalRecord2());
        records.add(CriminalRecordMock.getCriminalRecord3());
        return records;
    }


   // public void delete(CriminalRecordsDto criminalRecordsDto) {
       // records.remove(criminalRecordsDto);
    //}
    //public void update(CriminalRecordsDto criminalRecordsDto) {

    //}

}
