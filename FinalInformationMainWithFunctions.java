package com.org.dl.main;

import com.example.jalartaeehelloword.FormServlet;
import com.org.dl.applicant.info.ApplicantInfoRetrieverService;
import com.org.dl.applicant.info.IApplicantInfoRetrieverService;
import com.org.dl.bo.*;
import com.org.dl.components.applicant.inforetriever.converter.dao.AddressVerificationDao;
import com.org.dl.components.applicant.inforetriever.converter.dao.CriminalRecordDao;
import com.org.dl.components.applicant.inforetriever.converter.dao.TestResultsDbDao;
import com.org.dl.components.applicant.inforetriever.converter.service.addressverification.AddressVerificationRetrieverService;
import com.org.dl.components.applicant.inforetriever.converter.service.addressverification.converter.AddressVerificationConverter;
import com.org.dl.components.applicant.inforetriever.converter.service.criminalrecord.CriminalRecordRetrieverService;
import com.org.dl.components.applicant.inforetriever.converter.service.criminalrecord.converter.CriminalRecordConverter;
import com.org.dl.components.applicant.inforetriever.converter.service.criminalrecord.converter.CriminalRecordsConverter;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.ITestResultsRetriever;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.TestResultsConverter;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.TestResultsRetriever;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.TestResultsRetrieverService;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.factory.ITestResultChainFactory;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.factory.TestResultChainFactory;
import com.org.dl.decidingOutcomes.*;
import com.org.dl.driversLicenseInfo.DriversLicense;
import com.org.dl.driversLicenseInfo.DriversLicenseBuilder;
import com.org.dl.returnFinalInformation.FinalDriversLicenseDTO;
import com.org.dl.returnFinalInformation.FinalInformationDTO;
import com.org.dl.extractors.ExtractDrivingTestResults;
import com.org.dl.extractors.ExtractVisionTestResults;
import com.org.dl.extractors.ExtractWrittenTestResults;
import com.org.dl.validation.ValidateCriminalRecord;

import java.util.Date;

public class FinalInformationMainWithFunctions {

    public static void main(String[] args) {
        FinalInformationMainWithFunctions obj = new FinalInformationMainWithFunctions();
        Applicant applicant = new Applicant(5591, "Ved", "Vyas", 25353, false, "none", "5'5");
        DriversLicense driversLicense = obj.crateDriverLicense(applicant);

        // Print outcomes

        System.out.println("Drivers License: " + driversLicense);
    }
    public DriversLicense crateDriverLicense(Applicant applicant) {
        //Applicant applicant = new Applicant(5591, "Ved", "Vyas", 25353, false, "none", "5'5");

        // Set up services and retrieve applicant information
        ApplicantActualInformation applicantActualInformation = setupAndRetrieveApplicantInformation(applicant);

        // Decide test outcomes
        FinalInformationDTO finalInfo = decideTestOutcomes(applicantActualInformation);

        // Build and print driver's license information

        return buildAndPrintDriversLicense(finalInfo, applicantActualInformation);
    }

    private ApplicantActualInformation setupAndRetrieveApplicantInformation(Applicant applicant) {
        AddressVerificationDao adao = new AddressVerificationDao();
        AddressVerificationConverter aconverter = new AddressVerificationConverter();
        AddressVerificationRetrieverService aservice = new AddressVerificationRetrieverService(adao, aconverter);

        CriminalRecordDao cdao = new CriminalRecordDao();
        CriminalRecordConverter crconverter = new CriminalRecordConverter();
        CriminalRecordsConverter crsconverter = new CriminalRecordsConverter(crconverter);
        CriminalRecordRetrieverService cservice = new CriminalRecordRetrieverService(cdao, crsconverter);

        TestResultsDbDao tdao = new TestResultsDbDao();
        ITestResultChainFactory factory = new TestResultChainFactory();
        ITestResultsRetriever testResultsRetriever = new TestResultsRetriever(factory);
        TestResultsConverter tconverter = new TestResultsConverter(testResultsRetriever);
        TestResultsRetrieverService tservice = new TestResultsRetrieverService(tdao, tconverter);

        IApplicantInfoRetrieverService service = new ApplicantInfoRetrieverService(aservice, cservice, tservice);
        return service.retrieve(applicant);
    }

    private FinalInformationDTO decideTestOutcomes(ApplicantActualInformation applicantActualInformation) {
        VisionTestResult visionTestResult = applicantActualInformation.testResults().getVisionTests().get(0);
        WrittenTestResult writtenTestResult = applicantActualInformation.testResults().getWrittenTests().get(0);
        DrivingTestResult drivingTestResult = applicantActualInformation.testResults().getDrivingTests().get(0);
        CriminalRecord record = applicantActualInformation.record();

        //todo: decideAddressOutcome, decideSSNInquiryOutcome
        DecideSSNOutcome decideSSNOutcome = new DecideSSNOutcome();
        DecideAddressOutcome decideAddressOutcome = new DecideAddressOutcome();
        DecideVisionOutcome decideVisionOutcome = new DecideVisionOutcome();
        DecideDrivingOutcome decideDrivingOutcome = new DecideDrivingOutcome();
        DecideCriminalOutcome decideCriminalOutcome = new DecideCriminalOutcome();
        DecideWrittenOutcome decideWrittenOutcome = new DecideWrittenOutcome();
        ValidateCriminalRecord validateCriminalRecord = new ValidateCriminalRecord();

        TestOutcome addressOutcome = decideAddressOutcome.decide(applicantActualInformation.address());
        TestOutcome ssnOutcome = decideSSNOutcome.decide(applicantActualInformation.ID());
        TestOutcome visionOutcome = decideVisionOutcome.decide(visionTestResult);
        TestOutcome drivingOutcome = decideDrivingOutcome.decide(drivingTestResult);
        TestOutcome criminalOutcome = decideCriminalOutcome.criminalRecordClear(validateCriminalRecord, record);
        TestOutcome writtenOutcome = decideWrittenOutcome.decide(writtenTestResult);

        return new FinalInformationDTO(criminalOutcome, drivingOutcome, visionOutcome, writtenOutcome, ssnOutcome, addressOutcome);
    }

    private DriversLicense buildAndPrintDriversLicense(FinalInformationDTO finalInfo, ApplicantActualInformation applicantActualInformation) {
        FinalDriversLicenseDTO finalDriversLicenseDTO = new FinalDriversLicenseDTO();
        System.out.println("Address Outcome: " + finalInfo.getAddressOutcome());
        System.out.println("SSN Outcome: " + finalInfo.getSsnOutcome());
        System.out.println("Criminal Outcome: " + finalInfo.getCriminalOutcome());
        System.out.println("Driving Outcome: " + finalInfo.getDrivingOutcome());
        System.out.println("Vision Outcome: " + finalInfo.getVisionOutcome());
        System.out.println("Written Outcome: " + finalInfo.getWrittenOutcome());

        // todo: check all the tests, ssn inquiry outcomes to decide whether driver licence should be created
        if(allTestingPassed(finalInfo)) {
            DriversLicenseBuilder driversLicenseBuilder = new DriversLicenseBuilder(applicantActualInformation);
            DriversLicense driversLicense = finalDriversLicenseDTO.getLicense(driversLicenseBuilder, finalInfo);
            return driversLicense;
        }
        return null;
    }

    private boolean allTestingPassed(FinalInformationDTO finalInfo) {
        return (finalInfo.getCriminalOutcome() == TestOutcome.PASS && finalInfo.getDrivingOutcome() == TestOutcome.PASS && finalInfo.getVisionOutcome() == TestOutcome.PASS && finalInfo.getWrittenOutcome() == TestOutcome.PASS && finalInfo.getAddressOutcome() == TestOutcome.PASS && finalInfo.getSsnOutcome() == TestOutcome.PASS);
    }
}

