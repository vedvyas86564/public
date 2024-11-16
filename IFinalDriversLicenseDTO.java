package com.org.dl.driversLicenseInfo;

import com.org.dl.returnFinalInformation.FinalInformationDTO;

public interface IFinalDriversLicenseDTO {
    public DriversLicense getLicense(DriversLicenseBuilder builder, FinalInformationDTO finalInformationDTO);
}
