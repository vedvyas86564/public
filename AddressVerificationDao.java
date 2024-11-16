package com.org.dl.components.applicant.inforetriever.converter.dao;

import com.org.dl.components.applicant.inforetriever.converter.dto.AddressVerificationDto;
import com.org.dl.components.applicant.inforetriever.converter.dto.mock.AddressVerificationMock;

import java.util.ArrayList;
import java.util.List;

public class AddressVerificationDao implements IAddressVerificationDao<AddressVerificationDto> {
    private List<AddressVerificationDto> addresses  = new ArrayList<>();

    public AddressVerificationDao() {
       CreateMockAddressVerification created = new CreateMockAddressVerification();
//       AddressVerificationMock mock = created.getMock();
        addresses.add(AddressVerificationMock.getAddressVerificationDto1());
        addresses.add(AddressVerificationMock.getAddressVerificationDto2());
    }


    @Override
    public List<AddressVerificationDto> getAll(String uri) {
        return addresses;
    }

    @Override
    public void delete(AddressVerificationDto addressVerificationDto) {
    addresses.remove(addressVerificationDto);
    }

    @Override
    public void update(AddressVerificationDto addressVerificationDto) {

    }

}
